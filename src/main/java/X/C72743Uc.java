package X;

import com.whatsapp.util.Log;
import com.whatsapp.wabloks.base.BkFragment;
import java.io.InputStream;

/* renamed from: X.3Uc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C72743Uc implements AbstractC67753Ac {
    public final /* synthetic */ BkFragment A00;
    public final /* synthetic */ AbstractC67753Ac A01;

    public /* synthetic */ C72743Uc(BkFragment bkFragment, AbstractC67753Ac r2) {
        this.A00 = bkFragment;
        this.A01 = r2;
    }

    @Override // X.AbstractC67753Ac
    public final void AJS(InputStream inputStream, String str, Throwable th) {
        BkFragment bkFragment = this.A00;
        AbstractC67753Ac r2 = this.A01;
        if (th == null) {
            try {
                C28051Sr.A1k(C006803i.A0J(inputStream), new C72803Ui(bkFragment));
                if (r2 != null) {
                    r2.AJS(inputStream, str, th);
                }
            } catch (Throwable th2) {
                Log.e("WaBloksFragment error: ", th2);
                if (r2 != null) {
                    r2.AJS(inputStream, str, th2);
                }
            }
        } else {
            throw th;
        }
    }
}
