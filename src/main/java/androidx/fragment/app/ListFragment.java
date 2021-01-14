package androidx.fragment.app;

import X.AnonymousClass037;
import X.C09010c9;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListFragment extends AnonymousClass037 {
    public View A00;
    public View A01;
    public View A02;
    public ListAdapter A03;
    public ListView A04;
    public TextView A05;
    public boolean A06;
    public final Handler A07 = new Handler();
    public final AdapterView.OnItemClickListener A08 = new C09010c9(this);
    public final Runnable A09 = new RunnableEBaseShape0S0100000_I0_0(this, 17);

    @Override // X.AnonymousClass037
    public void A0X() {
        this.A07.removeCallbacks(this.A09);
        this.A04 = null;
        this.A06 = false;
        this.A01 = null;
        this.A02 = null;
        this.A00 = null;
        this.A05 = null;
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        A0n();
    }

    public final void A0n() {
        if (this.A04 == null) {
            View view = this.A0A;
            if (view != null) {
                if (view instanceof ListView) {
                    this.A04 = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(16711681);
                    this.A05 = textView;
                    if (textView == null) {
                        this.A00 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.A02 = view.findViewById(16711682);
                    this.A01 = view.findViewById(16711683);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.A04 = listView;
                        View view2 = this.A00;
                        if (view2 != null) {
                            listView.setEmptyView(view2);
                        }
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.A06 = true;
                this.A04.setOnItemClickListener(this.A08);
                ListAdapter listAdapter = this.A03;
                if (listAdapter != null) {
                    this.A03 = null;
                    A0o(listAdapter);
                } else if (this.A02 != null) {
                    A0p(false, false);
                }
                this.A07.post(this.A09);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    public void A0o(ListAdapter listAdapter) {
        boolean z = false;
        boolean z2 = false;
        if (this.A03 != null) {
            z2 = true;
        }
        this.A03 = listAdapter;
        ListView listView = this.A04;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.A06 && !z2) {
                if (A07().getWindowToken() != null) {
                    z = true;
                }
                A0p(true, z);
            }
        }
    }

    public final void A0p(boolean z, boolean z2) {
        A0n();
        View view = this.A02;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.A06 != z) {
            this.A06 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(A00(), 17432577));
                    this.A01.startAnimation(AnimationUtils.loadAnimation(A00(), 17432576));
                } else {
                    view.clearAnimation();
                    this.A01.clearAnimation();
                }
                this.A02.setVisibility(8);
                this.A01.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(A00(), 17432576));
                this.A01.startAnimation(AnimationUtils.loadAnimation(A00(), 17432577));
            } else {
                view.clearAnimation();
                this.A01.clearAnimation();
            }
            this.A02.setVisibility(0);
            this.A01.setVisibility(8);
        }
    }
}
