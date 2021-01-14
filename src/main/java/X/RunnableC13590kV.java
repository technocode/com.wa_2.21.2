package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.0kV  reason: invalid class name and case insensitive filesystem */
public class RunnableC13590kV extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C13620kY A01;
    public final /* synthetic */ CharSequence A02;

    public RunnableC13590kV(C13620kY r1, CharSequence charSequence, int i) {
        this.A01 = r1;
        this.A02 = charSequence;
        this.A00 = i;
    }

    public void run() {
        CharSequence charSequence = this.A02;
        if (charSequence == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.A01.A00.A00.getString(R.string.default_error_msg));
            sb.append(" ");
            sb.append(this.A00);
            charSequence = sb.toString();
        }
        AbstractC13660kc r1 = this.A01.A00.A05;
        int i = this.A00;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                break;
            case 6:
            default:
                i = 8;
                break;
        }
        r1.A00(i, charSequence);
    }
}
