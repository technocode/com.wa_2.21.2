package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

/* renamed from: X.0Ha  reason: invalid class name and case insensitive filesystem */
public class ActivityC03630Ha extends ActivityC004602e {
    public ListAdapter A00;
    public ListView A01;
    public boolean A02 = false;
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final AdapterView.OnItemClickListener A04 = new AnonymousClass1K9(this);
    public final Runnable A05 = new RunnableEBaseShape1S0100000_I0_1(this, 42);

    public ListView A0T() {
        if (this.A01 == null) {
            setContentView(17367060);
        }
        ListView listView = this.A01;
        if (listView != null) {
            return listView;
        }
        throw null;
    }

    public void A0U(ListAdapter listAdapter) {
        synchronized (this) {
            if (this.A01 == null) {
                setContentView(17367060);
            }
            this.A00 = listAdapter;
            this.A01.setAdapter(listAdapter);
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A03.removeCallbacks(this.A05);
        super.onDestroy();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        if (this.A01 == null) {
            setContentView(17367060);
        }
        super.onRestoreInstanceState(bundle);
    }
}
