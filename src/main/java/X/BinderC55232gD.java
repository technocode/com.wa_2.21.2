package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.whatsapp.instrumentation.api.InstrumentationService;

/* renamed from: X.2gD  reason: invalid class name and case insensitive filesystem */
public class BinderC55232gD extends Binder implements IInterface {
    public final /* synthetic */ InstrumentationService A00;

    public IBinder asBinder() {
        return this;
    }

    public BinderC55232gD(InstrumentationService instrumentationService) {
        this.A00 = instrumentationService;
        attachInterface(this, "com.whatsapp.instrumentation.InstrumentationInterface");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0264, code lost:
        if (r7.equals("mark_message_read") != false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x041c, code lost:
        if (r7.equals("access_contacts") != false) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0470, code lost:
        if (r7.equals("get_call_state") != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x050c, code lost:
        if (r7.equals("reject_call") != false) goto L_0x050e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019a, code lost:
        if (r7.equals("hang_up_call") != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01aa, code lost:
        if (r7.equals("get_unread_messages") != false) goto L_0x01ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0472  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x049b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01ac  */
    @Override // android.os.Binder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r24, android.os.Parcel r25, android.os.Parcel r26, int r27) {
        /*
        // Method dump skipped, instructions count: 2116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BinderC55232gD.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
