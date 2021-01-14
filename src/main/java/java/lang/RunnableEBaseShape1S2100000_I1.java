package java.lang;

import X.AbstractActivityC60812rK;
import X.AnonymousClass008;
import X.AnonymousClass02M;
import X.AnonymousClass0H4;
import X.AnonymousClass0H7;
import X.AnonymousClass33N;
import X.C03570Gt;
import X.C32391es;
import X.C51042Xc;
import X.C59382nY;
import X.TextureView$SurfaceTextureListenerC32431ew;
import android.app.ProgressDialog;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;

public class RunnableEBaseShape1S2100000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    public RunnableEBaseShape1S2100000_I1(C32391es r2, String str, String str2) {
        this.A03 = 0;
        this.A00 = r2;
        this.A02 = str;
        this.A01 = str2;
    }

    public RunnableEBaseShape1S2100000_I1(Object obj, String str, String str2, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A02 = str2;
    }

    public void run() {
        switch (this.A03) {
            case 0:
                String str = this.A02;
                String str2 = this.A01;
                TextureView$SurfaceTextureListenerC32431ew r3 = ((C32391es) this.A00).A00;
                r3.A0K.A01();
                r3.A0J.A00(4, new Object[]{r3.A0N.A00, str, str2});
                return;
            case 1:
                ((SettingsGoogleDrive) this.A00).A0d(this.A01, this.A02);
                return;
            case 2:
                String str3 = this.A01;
                String str4 = this.A02;
                AbstractActivityC60812rK r1 = ((C51042Xc) this.A00).A00;
                ProgressDialog progressDialog = r1.A00;
                if (progressDialog != null && progressDialog.isShowing()) {
                    r1.A00.dismiss();
                }
                r1.A0N(str3, str4);
                return;
            case 3:
                String str5 = this.A01;
                String str6 = this.A02;
                ConversationsFragment conversationsFragment = ((C59382nY) this.A00).A04;
                conversationsFragment.A0A.setText(str6);
                conversationsFragment.A09.setText(str5);
                return;
            case 4:
                String str7 = this.A01;
                String str8 = this.A02;
                AnonymousClass008.A18("conversations-gdrive-observer/set-message ", str7);
                ConversationsFragment conversationsFragment2 = ((C59382nY) this.A00).A04;
                conversationsFragment2.A0A.setText(str8);
                conversationsFragment2.A09.setText(str7);
                return;
            case 5:
                C03570Gt r5 = (C03570Gt) this.A00;
                String str9 = this.A01;
                String str10 = this.A02;
                try {
                    AnonymousClass0H4 r6 = r5.A0K;
                    AnonymousClass33N A04 = r6.A02.A04(str9, str10);
                    r6.A05.A01(AnonymousClass0H7.A03(r6.A01.A00, A04), A04);
                    if (!A04.A0L) {
                        r6.A04.A01(str9, str10, A04.A04);
                    }
                    StringBuilder sb = new StringBuilder("ThirdPartyStickerManager/addPack, added authority: ");
                    sb.append(str9);
                    sb.append(", identifier: ");
                    sb.append(str10);
                    Log.d(sb.toString());
                    r6.A06.A02(str9, str10, A04);
                    r5.A0Q.A01(A04.A0D);
                    r5.A0D.A0G(r5.A0A(r5.A0D()), "add");
                } catch (Exception unused) {
                    Log.e("StickerRepository/InstallThirdPartyStickerPackAsyncTask failed to install third party pack");
                }
                AnonymousClass02M r2 = r5.A03;
                r2.A02.post(new RunnableEBaseShape0S2100000_I0(r5, str9, str10, 3));
                return;
            default:
                return;
        }
    }
}
