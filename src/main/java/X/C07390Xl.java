package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.0Xl  reason: invalid class name and case insensitive filesystem */
public class C07390Xl implements AnonymousClass0C0 {
    public static volatile C07390Xl A0D;
    public final AnonymousClass09G A00;
    public final AnonymousClass00S A01;
    public final AnonymousClass01K A02;
    public final AnonymousClass0AR A03;
    public final C07400Xm A04;
    public final C02010Ah A05;
    public final AnonymousClass0GR A06;
    public final C02040Ak A07;
    public final C01970Ad A08;
    public final C04550Ku A09;
    public final C018809u A0A = C018809u.A00("PaymentsXmppMessageHandler", "notification", "COMMON");
    public final AnonymousClass01R A0B;
    public final AnonymousClass00T A0C;

    public C07390Xl(AnonymousClass00S r4, AnonymousClass00T r5, AnonymousClass0AR r6, AnonymousClass09G r7, C01970Ad r8, AnonymousClass01K r9, C02010Ah r10, AnonymousClass01R r11, C02040Ak r12, C04550Ku r13, AnonymousClass0GR r14, C07400Xm r15) {
        this.A01 = r4;
        this.A0C = r5;
        this.A03 = r6;
        this.A00 = r7;
        this.A08 = r8;
        this.A02 = r9;
        this.A05 = r10;
        this.A0B = r11;
        this.A07 = r12;
        this.A09 = r13;
        this.A06 = r14;
        this.A04 = r15;
    }

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{133, 161, 211, 217, 219};
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        if (i == 133) {
            this.A0C.ANF(new RunnableEBaseShape3S0200000_I0_2(this, message.getData(), 33));
            return true;
        } else if (i == 161) {
            Bundle data = message.getData();
            this.A0C.ANF(new RunnableEBaseShape0S0300000_I0_0(this, data, data.getParcelable("jid"), 48));
            return true;
        } else if (i == 211) {
            Bundle data2 = message.getData();
            this.A0C.ANF(new RunnableEBaseShape0S0300000_I0_0(this, data2, data2.getParcelable("jid"), 47));
            return true;
        } else if (i == 217) {
            this.A0C.ANF(new RunnableEBaseShape3S0200000_I0_2(this, message.getData(), 31));
            return true;
        } else if (i != 219) {
            return false;
        } else {
            this.A0C.ANF(new RunnableEBaseShape3S0200000_I0_2(this, message.getData(), 32));
            return true;
        }
    }
}
