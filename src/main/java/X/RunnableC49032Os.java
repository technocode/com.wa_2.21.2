package X;

import java.util.List;

/* renamed from: X.2Os  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC49032Os extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ AnonymousClass0M4 A01;
    public final /* synthetic */ C54162eS A02;
    public final /* synthetic */ AbstractC007503q A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ byte[] A07;

    public /* synthetic */ RunnableC49032Os(C54162eS r1, AnonymousClass0M4 r2, byte b, String str, AbstractC007503q r5, String str2, List list, byte[] bArr) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = b;
        this.A04 = str;
        this.A03 = r5;
        this.A05 = str2;
        this.A06 = list;
        this.A07 = bArr;
    }

    public final void run() {
        C54162eS r5 = this.A02;
        AnonymousClass0M4 r9 = this.A01;
        byte b = this.A00;
        String str = this.A04;
        AbstractC007503q r14 = this.A03;
        String str2 = this.A05;
        List list = this.A06;
        byte[] bArr = this.A07;
        C04360Kb r1 = r5.A06;
        AnonymousClass0CP r7 = r5.A0E;
        List list2 = r5.A0O;
        byte b2 = b;
        if (r5.A0S) {
            b2 = 42;
            if (b == 3) {
                b2 = 43;
            }
        }
        r1.A07(r7.A01(list2, r9, b2, C54162eS.A00(r5.A00), str, null, r14, C006803i.A0O(str2), r5.A0Q, 0, list), bArr);
    }
}
