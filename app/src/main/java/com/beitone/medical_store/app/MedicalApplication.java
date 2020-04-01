package com.beitone.medical_store.app;

import android.app.Application;

import com.bt.http.OkHttpUtils;
import com.bt.http.https.HttpsUtils;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okio.Buffer;

public class MedicalApplication extends Application {

    private String CER_HYJ = "-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEpQIBAAKCAQEAvLfPEio+7Ve/GZTuURjZ7pl2Q8EzAWZV4JhCO2xGxniBFwF7\n" +
            "g9F4QZR71f1CaHc5yW5PruPYgdnyCCEa0P8AbScKxMgIdIODUdOj4R7/4ZiCXvcp\n" +
            "HauHbRvSL0kDPN0KNhANRz6lTmiGHhk1EhkkjkDtshKRXefHpGTH8YOBNs6cVziX\n" +
            "BMUdFMwJ0Q0vDk/9+hdAwVf0YSUDPHGvFSjmjTnrUVY1x/hMZ8E1BPfIzlDQeDOB\n" +
            "AJXdTfx6qBStHg+VbJx7/qHUZc+7JoGDt6HeUfZQWLdZTr3DPGSsKLOAsAQzyir9\n" +
            "B3yXOPC/9zpk9gqs02Knyi88TQF4ORj0pyj4VQIDAQABAoIBAQCo0rZHxcstgAXQ\n" +
            "2M6pddXgASEvU7JRWj8RAKSfjCl0e3DgJ89bCRTPdgmiUUILOj1T2X8nMWUKJPLE\n" +
            "GvlmZfj3rKmRiHEn6k6b8Pz180ltg4V9dxYtGLm5/d11t5dR51uvKYT3ay9uiUsR\n" +
            "ufMkEaIGMEdzufCZVTPf+Nh1UfNSFtCsF4foYlKrJIhOBxyDB1IdqTIcX8tzqhPc\n" +
            "6JSMtBca3MKNo+Di61Z2TwtVJsLqTMj9uLRw5B4dhxr0LVyvlnBueQNK0DnRtPMG\n" +
            "YZbnxu8qUuTb96G4BHXHArVlLgYkXp5jiDVIOu/ZrRnRFxX8DqGmPW3eVi3wbygz\n" +
            "OONbmycxAoGBAOyDrgMSmE2tK+buj7rtC0vELsLx7HR/cAHf/VjdI+hiMRMO0UbG\n" +
            "XJCc89rAGzCphRacOGSThmEBcK0aGHGU5DOiE11j1yIJCcQj0M6dWKnlW2OSf2Pa\n" +
            "K+WI8wGU8wG9VF+XEiOjshnOzo+d4BA7JNwjZjYsE1HcqD4Xnua+YvQzAoGBAMxE\n" +
            "Doiyvvzczw1xVHwRUpOfi79n6GHyfDmonzogt4yXRbUx6nhhz3ZFJTMgb5Il8yrf\n" +
            "B7HS3iF8XOMTcSn+6XcLGfC9UwQ8Hf2ZH2tNeI9UXupDn2udYOIjv6aGiFzp5ejD\n" +
            "5ZUu1TsuPQBgr0W/eJwlT0Rzj7/c18iJ4lU4lRlXAoGBAJYnd2c9+/F8mp2vIRL0\n" +
            "gTJl56YePxcq/OpD0S0EoFJdXHiT9KsxLf0ll+9t/RUk2nijT24S9sJJTsanBZO+\n" +
            "ii55nD+zLhbOlCOw9VTnMi4SjbWmgTfcf/fmvRho/upAz/ssBvkXaO/Xiu5Etca4\n" +
            "NcuIsdB8pPtY0nsxNdGaV2pfAoGAByTKLVWzADzosNupzLz+WlNWG9eSdPp6Bboz\n" +
            "92B1iuEveurH/HXPP5+jcWpM/Jt/KZyrNDjfs+QZi4d+ia10lMk6mwTEBn3jvp7A\n" +
            "ToxjDwAwYZkD1kumu8HsTfKeikFT3RQcz17X7j3rvDulZZcQrMVRRF+WQ2uB0G2i\n" +
            "EMDt1fkCgYEAuu5kFpcQ94Z3zj5TcOE9tIoPbOqkxQnXr1BEdOrURiB22UdyT4Nw\n" +
            "uzCf161zmWHu3ixjnY/27qBLZ229mFVzNZCpkpUh+DG8dv7boW3EAQFLUG7itH7+\n" +
            "gkUn0ydzYbLmRyI9GczZ5sj5Ugz4IPLjzF0maXDxdzWYXvTcZu1Itu8=\n" +
            "-----END RSA PRIVATE KEY-----";

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            String a = "";
            InputStream[] inputStreams =
                    new InputStream[]{getResources().openRawResource(R.raw.testhyj91)};
            HttpsUtils.SSLParams sslParams =
                    HttpsUtils.getSslSocketFactory(new InputStream[]{new Buffer().writeUtf8(CER_HYJ).inputStream()},
                            getResources().openRawResource(R.raw.testhyj), null);

            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    //.hostnameVerifier((s, sslSession) -> true)
                    //.sslSocketFactory(sslParams.sSLSocketFactory, sslParams.trustManager)
                    .connectTimeout(60000L, TimeUnit.MILLISECONDS)
                    .readTimeout(60000L, TimeUnit.MILLISECONDS)
                    .writeTimeout(60000L, TimeUnit.MILLISECONDS)
                    .build();
            OkHttpUtils.initClient(okHttpClient);
        } catch (Exception e) {

        }

    }
}
