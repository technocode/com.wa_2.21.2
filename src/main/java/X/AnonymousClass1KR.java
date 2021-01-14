package X;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.AudioPickerActivity;

/* renamed from: X.1KR  reason: invalid class name */
public class AnonymousClass1KR {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public AnonymousClass1KR(AudioPickerActivity audioPickerActivity, int i, String str, String str2, String str3, int i2, int i3) {
        int i4 = i3;
        this.A00 = i;
        this.A02 = (TextUtils.isEmpty(str) || str.equalsIgnoreCase("<unknown>")) ? null : str;
        this.A07 = str2;
        this.A03 = str3;
        this.A01 = i4;
        this.A05 = DateUtils.formatElapsedTime(((long) i2) / 1000);
        AnonymousClass01X r3 = ((AnonymousClass2C0) audioPickerActivity).A01;
        long A062 = ((long) ((ActivityC004702f) audioPickerActivity).A0G.A06(AbstractC000400g.A3a)) * SearchActionVerificationClientService.MS_TO_NS;
        long j = (long) i4;
        if (j >= A062 - 60000 && j < A062) {
            i4 = (int) (j - 60000);
        }
        this.A06 = (String) C002001d.A0i(r3, (long) i4, true).first;
        this.A04 = C002001d.A1X(r3, (long) Math.max(0, i2));
    }
}
