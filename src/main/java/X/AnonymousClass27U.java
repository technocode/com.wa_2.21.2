package X;

import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.27U  reason: invalid class name */
public final class AnonymousClass27U extends AbstractC09870df {
    public final /* synthetic */ AbstractC07170We A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r3.A01 instanceof com.whatsapp.backup.google.RestoreFromBackupActivity) == false) goto L_0x000b;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass27U(X.AbstractC07170We r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            r2.A00 = r3
            if (r5 == 0) goto L_0x000b
            android.app.Activity r0 = r3.A01
            boolean r1 = r0 instanceof com.whatsapp.backup.google.RestoreFromBackupActivity
            r0 = 0
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            r2.<init>(r3, r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27U.<init>(X.0We, boolean, boolean):void");
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        int intValue;
        Integer[] numArr = (Integer[]) objArr;
        AbstractC07170We r1 = this.A00;
        int intValue2 = numArr[0].intValue();
        AnonymousClass0GE r11 = ((C07160Wd) r1).A00;
        if (r11 instanceof RestoreFromBackupActivity) {
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r11;
            if (intValue2 - restoreFromBackupActivity.A00 > 0) {
                restoreFromBackupActivity.A00 = intValue2;
                if (intValue2 % 10 == 0) {
                    StringBuilder sb = new StringBuilder("gdrive-activity/msg-restore-progress/");
                    sb.append(intValue2);
                    sb.append("%");
                    Log.i(sb.toString());
                }
                if (intValue2 <= 100) {
                    TextView textView = restoreFromBackupActivity.A07;
                    AnonymousClass01X r9 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                    textView.setText(r9.A0D(R.string.settings_gdrive_backup_msgstore_restore_message_with_percentage_placeholder, r9.A0H().format(((double) intValue2) / 100.0d)));
                    restoreFromBackupActivity.A05.setIndeterminate(true);
                }
            }
        }
        AnonymousClass1ND r0 = AbstractC07170We.A06;
        if (r0 != null && r0.getProgress() != (intValue = numArr[0].intValue())) {
            AbstractC07170We.A06.setProgress(intValue);
        }
    }
}
