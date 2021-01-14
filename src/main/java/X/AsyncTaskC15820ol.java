package X;

import android.os.AsyncTask;
import android.util.Log;

/* renamed from: X.0ol  reason: invalid class name and case insensitive filesystem */
public class AsyncTaskC15820ol extends AsyncTask {
    public final /* synthetic */ C15830om A00;
    public final /* synthetic */ AbstractC15850oo A01;

    public AsyncTaskC15820ol(C15830om r1, AbstractC15850oo r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // android.os.AsyncTask
    public Object doInBackground(Object[] objArr) {
        try {
            return this.A00.A00();
        } catch (Exception e) {
            Log.e("Palette", "Exception thrown during async generate", e);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        this.A01.AGQ((C15870oq) obj);
    }
}
