package X;

import com.whatsapp.util.Log;

/* renamed from: X.0hf  reason: invalid class name and case insensitive filesystem */
public final class C12170hf extends C05390Oi {
    public int A00;

    public C12170hf(C007303n r2, long j) {
        super(r2, j, 60);
    }

    @Override // X.AbstractC007503q
    public synchronized void A0d(String str) {
        try {
            this.A00 = Integer.valueOf(str).intValue();
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("FMessageSystemEphemeralSettingNotApplied/setData cannot convert data to int, data=");
            sb.append(str);
            Log.w(sb.toString(), e);
            this.A00 = 0;
        }
        return;
    }
}
