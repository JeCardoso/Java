package com.meuclienteandroid;

import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONObject;

import javax.net.ssl.HostnameVerifier;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import java.security.KeyStore;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.EditText;



public class MyActivity extends Activity {

    private static final String SERVICE_URL = "https://192.168.1.120:8443/MeuWebServer/webresources/controller";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }

    public void convert(View vw){

        postData(vw);
        getData(vw);

    }

    public void getData(View vw){

        WebServiceTask wstask = new WebServiceTask(WebServiceTask.GET, this);

        wstask.execute(new String[] {SERVICE_URL + "/convert_temperature"});
    }

    public void postData(View vw){

        EditText editTemperature = (EditText) findViewById(R.id.edTemperature);

        String temperature = editTemperature.getText().toString();

        WebServiceTask wstask = new WebServiceTask(WebServiceTask.POST, this);

        wstask.addPair("value", temperature);
        wstask.execute(new String[] {SERVICE_URL});

    }

    public void manageResponse(String response){

        EditText editTemperature = (EditText) findViewById(R.id.edTemperature);

        editTemperature.setText("");

        try {

            JSONObject jo = new JSONObject(response);
            String temperature = jo.getString("value");
            editTemperature.setText(temperature);

        } catch (Exception e){

            Log.e("MyActivity", response);

        }

    }

    private class WebServiceTask extends AsyncTask<String, Integer, String> {

        public static final int POST = 1;
        public static final int GET =2;
        private int taskType;

        private Context context = null;

        private ArrayList<NameValuePair> pair = new ArrayList<NameValuePair>();

        private ProgressDialog popWait = null;

        public WebServiceTask(int taskType, Context context){

            this.taskType = taskType;
            this.context = context;
        }

        public void addPair(String name, String value){

            pair.add(new BasicNameValuePair(name, value));
        }


        //Antes de executar
        @Override
        protected void onPreExecute(){

            popWait = new ProgressDialog(context);
            popWait.setMessage("Aguarde...");
            popWait.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            popWait.setCancelable(false);
            popWait.show();

        }

        // Depois de executar
        @Override
        protected void onPostExecute(String result){

            manageResponse(result);
            popWait.dismiss();

        }

        // Executado em uma thread em background
        @Override
        protected String doInBackground(String... urls){

            String url = urls[0];
            String result = "";

            SchemeRegistry registry = new SchemeRegistry();
            registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            registry.register((new Scheme("https", mySSLSocketFactory(), 443)));
            ClientConnectionManager manager = new ThreadSafeClientConnManager(getHttpParameters(), registry);

            HttpResponse response = null;
            HttpClient httpClient = new DefaultHttpClient(manager, getHttpParameters());

            try{
                switch (taskType){

                    case POST:
                        HttpPost httpPost = new HttpPost(url);

                        httpPost.setEntity(new UrlEncodedFormEntity(pair));
                        response = httpClient.execute(httpPost);
                        break;

                    case GET:
                        HttpGet httpGet = new HttpGet(url);

                        response = httpClient.execute(httpGet);
                        break;
                }
            } catch (Exception e){
                Log.e("WebServiceTask", e.getLocalizedMessage());
            }

            if (response != null){

                try {

                    result = convertInputToString(response.getEntity().getContent());

                } catch (IOException e){
                    Log.e("WebServiceTask", e.getLocalizedMessage());
                }

            }

            return result;
        }

        // Configurar parametros
        private HttpParams getHttpParameters(){

            HttpParams parameters = new BasicHttpParams();

            HttpConnectionParams.setConnectionTimeout(parameters, 5000);
            HttpConnectionParams.setSoTimeout(parameters, 5000);


            return parameters;
        }

        private String convertInputToString(InputStream input){

            String line = "";
            StringBuilder fullString = new StringBuilder();

            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            try {
                while ((line = reader.readLine()) != null){

                    fullString.append(line);

                }
            } catch (IOException e){
                Log.e("WebServiceTask", e.getLocalizedMessage());
            }

            return fullString.toString();
        }

        private SSLSocketFactory mySSLSocketFactory(){

            try{
                KeyStore ks = KeyStore.getInstance("BKS");
                InputStream in = context.getResources().openRawResource(R.raw.keystore);
                ks.load(in, "123456".toCharArray());
                in.close();

                SSLSocketFactory sf = new SSLSocketFactory(ks);
                HostnameVerifier hv = org.apache.http.conn.ssl.SSLSocketFactory.STRICT_HOSTNAME_VERIFIER;
                sf.setHostnameVerifier((X509HostnameVerifier) hv);

                return sf;
            } catch (Exception e){
                throw new Error(e);
            }
        }

    }

}

