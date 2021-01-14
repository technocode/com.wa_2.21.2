package X;

import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkScreenFragment;
import java.io.InputStream;

/* renamed from: X.3Ud  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72753Ud implements AbstractC67753Ac {
    public final /* synthetic */ BkScreenFragment A00;

    public /* synthetic */ C72753Ud(BkScreenFragment bkScreenFragment) {
        this.A00 = bkScreenFragment;
    }

    @Override // X.AbstractC67753Ac
    public final void AJS(InputStream inputStream, String str, Throwable th) {
        RunnableEBaseShape13S0100000_I1_8 runnableEBaseShape13S0100000_I1_8;
        AnonymousClass02M r1;
        BkScreenFragment bkScreenFragment = this.A00;
        if (th != null) {
            try {
                if (th instanceof C73143Vq) {
                    throw ((C73143Vq) th);
                }
                throw th;
            } catch (C73143Vq unused) {
                Intent intent = new Intent();
                intent.putExtra("error_code", 475);
                bkScreenFragment.A0A().setResult(-1, intent);
                bkScreenFragment.A0A().finish();
            } catch (Throwable unused2) {
                Log.e("BloksScreenFragment iq error", th);
                View view = ((AnonymousClass037) bkScreenFragment).A0A;
                if (view != null) {
                    C36901n6.A00(view, ((AnonymousClass01X) bkScreenFragment.A07.get()).A06(R.string.error_unexpected), 0).A04();
                }
                ((AnonymousClass02M) bkScreenFragment.A06.get()).A02.post(new RunnableEBaseShape13S0100000_I1_8(bkScreenFragment, 42));
            }
        } else {
            try {
                C28051Sr.A1k(C006803i.A0J(inputStream), new C72823Uk(bkScreenFragment));
                r1 = (AnonymousClass02M) bkScreenFragment.A06.get();
                runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(bkScreenFragment, 42);
            } catch (Exception e) {
                Log.e("BloksScreenFragment parse error", e);
                View view2 = ((AnonymousClass037) bkScreenFragment).A0A;
                if (view2 != null) {
                    C36901n6.A00(view2, ((AnonymousClass01X) bkScreenFragment.A07.get()).A06(R.string.error_unexpected), 0).A04();
                }
                r1 = (AnonymousClass02M) bkScreenFragment.A06.get();
                runnableEBaseShape13S0100000_I1_8 = new RunnableEBaseShape13S0100000_I1_8(bkScreenFragment, 42);
            } catch (Throwable th2) {
                ((AnonymousClass02M) bkScreenFragment.A06.get()).A02.post(new RunnableEBaseShape13S0100000_I1_8(bkScreenFragment, 42));
                throw th2;
            }
            r1.A02.post(runnableEBaseShape13S0100000_I1_8);
        }
    }
}
