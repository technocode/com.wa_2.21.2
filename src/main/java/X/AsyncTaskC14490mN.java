package X;

import android.os.AsyncTask;

/* renamed from: X.0mN  reason: invalid class name and case insensitive filesystem */
public final class AsyncTaskC14490mN extends AsyncTask {
    public final /* synthetic */ AnonymousClass0PF A00;

    public AsyncTaskC14490mN(AnonymousClass0PF r1) {
        this.A00 = r1;
    }

    @Override // android.os.AsyncTask
    public Object doInBackground(Object[] objArr) {
        while (true) {
            AnonymousClass0PF r2 = this.A00;
            AbstractC14510mP A02 = r2.A02();
            if (A02 == null) {
                return null;
            }
            r2.A05(A02.getIntent());
            A02.A2s();
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Object obj) {
        this.A00.A03();
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        this.A00.A03();
    }
}
