package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;

/* renamed from: X.2oh  reason: invalid class name and case insensitive filesystem */
public class C60042oh extends C54832fZ {
    public final /* synthetic */ AnonymousClass0EO A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60042oh(AnonymousClass0EO r13, AnonymousClass00S r14, AnonymousClass0C4 r15, AnonymousClass01K r16, AnonymousClass0EO r17, AnonymousClass01R r18, AnonymousClass0A8 r19, AnonymousClass2CD r20, String str, List list, File file, File file2) {
        super(r14, r15, r16, r17, r18, r19, r20, str, list, null);
        this.A00 = r13;
        this.A01 = file;
        this.A02 = file2;
    }

    @Override // X.AnonymousClass1W0
    public void ANA(Jid jid) {
        AnonymousClass02U r9 = (AnonymousClass02U) jid;
        super.A01(r9);
        AnonymousClass0EO r4 = this.A00;
        C007003k A0A = r4.A0A.A0A(r9);
        File file = this.A01;
        AnonymousClass08C r7 = r4.A0D;
        if (!file.renameTo(r7.A02(A0A))) {
            StringBuilder A0S = AnonymousClass008.A0S("group/create again, failed to rename ");
            A0S.append(file.getAbsolutePath());
            A0S.append(" to ");
            A0S.append(r7.A02(A0A).getAbsolutePath());
            Log.w(A0S.toString());
        }
        File file2 = this.A02;
        if (!file2.renameTo(r7.A03(A0A))) {
            StringBuilder A0S2 = AnonymousClass008.A0S("group/create again, failed to rename ");
            A0S2.append(file2.getAbsolutePath());
            A0S2.append(" to ");
            A0S2.append(r7.A03(A0A).getAbsolutePath());
            Log.w(A0S2.toString());
        }
        r4.A08.A07(A0A);
    }
}
