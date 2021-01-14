package java.lang;

import X.AnonymousClass0AI;
import X.AnonymousClass0QJ;
import X.AnonymousClass2C0;
import X.C07550Yd;
import X.C28241Tl;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

public class RunnableEBaseShape0S2200000_I1 extends RunnableEmptyBase implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public RunnableEBaseShape0S2200000_I1(Object obj, String str, String str2, Object obj2, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = obj2;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                String str = this.A02;
                String str2 = this.A03;
                TextView textView = (TextView) restoreFromBackupActivity.findViewById(R.id.gdrive_restore_info);
                if (textView != null) {
                    textView.setText(((AnonymousClass2C0) restoreFromBackupActivity).A01.A0D(R.string.local_restore_info, null, str, str2));
                    restoreFromBackupActivity.A03.setVisibility(8);
                    return;
                }
                throw null;
            case 1:
                String str3 = this.A02;
                String str4 = this.A03;
                AnonymousClass0AI r2 = ((C07550Yd) this.A00).A07;
                r2.A00.A09(new C28241Tl(((AnonymousClass0QJ) this.A01).A02, str3, str4));
                return;
            default:
                return;
        }
    }
}
