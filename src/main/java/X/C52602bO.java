package X;

import android.os.ConditionVariable;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: X.2bO  reason: invalid class name and case insensitive filesystem */
public class C52602bO implements AbstractC47932Kg {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ AnonymousClass0HO A01;

    public C52602bO(AnonymousClass0HO r1, ConditionVariable conditionVariable) {
        this.A01 = r1;
        this.A00 = conditionVariable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r7.A0D.A03() != 0) goto L_0x001e;
     */
    @Override // X.AbstractC47932Kg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void ACe(int r15) {
        /*
        // Method dump skipped, instructions count: 500
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52602bO.ACe(int):void");
    }

    @Override // X.AbstractC47932Kg
    public void ADW() {
        AnonymousClass0HO r4 = this.A01;
        r4.A00 = false;
        AnonymousClass02M r6 = r4.A03;
        r6.A05(R.string.msg_store_backup_db_title, R.string.settings_backup_db_now_message);
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        AnonymousClass01X r5 = r4.A0E;
        r6.A0F(AnonymousClass0OZ.A01(r5, r5.A0D(R.string.msg_store_backup_db_message, AnonymousClass0OZ.A00(r5, timeInMillis)), timeInMillis));
    }

    @Override // X.AbstractC47932Kg
    public void AIu(int i) {
        String format = String.format(Locale.ENGLISH, "app/backup/progress/%d%%", Integer.valueOf(i));
        if (i % 10 == 0) {
            Log.i(format);
        }
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 2);
        long timeInMillis = instance.getTimeInMillis();
        AnonymousClass0HO r0 = this.A01;
        AnonymousClass02M r9 = r0.A03;
        AnonymousClass01X r10 = r0.A0E;
        r9.A0F(AnonymousClass0OZ.A01(r10, r10.A0D(R.string.msg_store_backup_db_message_with_percentage_placeholder, r10.A0H().format(((double) i) / 100.0d), AnonymousClass0OZ.A00(r10, timeInMillis)), timeInMillis));
    }
}
