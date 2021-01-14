package java.lang;

import X.AbstractC33031g5;
import X.AnonymousClass0MH;
import X.C61112sW;
import X.C68493Dk;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public class RunnableEBaseShape1S0310000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 2;

    public RunnableEBaseShape1S0310000_I1(C68493Dk r2, TextView textView, AnonymousClass0MH r4, boolean z) {
        this.A00 = r2;
        this.A01 = textView;
        this.A02 = r4;
        this.A03 = z;
    }

    public RunnableEBaseShape1S0310000_I1(boolean z, AbstractC33031g5 r3, Object obj, Exception exc) {
        this.A03 = z;
        this.A00 = r3;
        this.A02 = obj;
        this.A01 = exc;
    }

    public RunnableEBaseShape1S0310000_I1(boolean z, ArrayList arrayList, Exception exc, Object obj) {
        this.A03 = z;
        this.A00 = arrayList;
        this.A01 = exc;
        this.A02 = obj;
    }

    public void run() {
        switch (this.A04) {
            case 0:
                if (this.A03) {
                    ((AbstractC33031g5) this.A00).A01(this.A02);
                    return;
                }
                Exception exc = (Exception) this.A01;
                if (exc instanceof CancellationException) {
                    ((AbstractC33031g5) this.A00).A00(exc);
                    return;
                } else {
                    ((AbstractC33031g5) this.A00).A00(exc);
                    return;
                }
            case 1:
                boolean z = this.A03;
                if (z || !((AbstractCollection) this.A00).isEmpty()) {
                    Iterator it = ((AbstractCollection) this.A00).iterator();
                    while (it.hasNext()) {
                        AbstractC33031g5 r2 = (AbstractC33031g5) it.next();
                        if (z) {
                            r2.A01(this.A02);
                        } else {
                            Exception exc2 = (Exception) this.A01;
                            if (exc2 instanceof CancellationException) {
                                r2.A00(exc2);
                            } else {
                                r2.A00(exc2);
                            }
                        }
                    }
                    return;
                }
                throw new RuntimeException((Throwable) this.A01);
            case 2:
                boolean z2 = this.A03;
                C61112sW r0 = ((C68493Dk) this.A00).A04;
                r0.A05((TextView) this.A01, false, (AnonymousClass0MH) this.A02, z2);
                r0.A00.A0C(r0.A02.A06(R.string.payments_request_canceling_failure_message), 0);
                return;
            default:
                return;
        }
    }
}
