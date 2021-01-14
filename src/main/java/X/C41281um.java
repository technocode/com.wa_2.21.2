package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1um  reason: invalid class name and case insensitive filesystem */
public class C41281um extends AnonymousClass1QA {
    public final AnonymousClass01I A00;

    public C41281um(AnonymousClass01I r1, AnonymousClass0GV r2, File file) {
        super(r2, file);
        this.A00 = r1;
    }

    public String A02() {
        AnonymousClass01I r2 = this.A00;
        r2.A04();
        if (r2.A00 == null) {
            Log.e("backup/BackupFileCrypt12/getUserJid MeManager.me is null");
            return null;
        }
        r2.A04();
        UserJid userJid = r2.A03;
        if (userJid != null) {
            return userJid.user;
        }
        Log.e("backup/BackupFileCrypt12/getUserJid MeManager.getMyJidObject() is null");
        return null;
    }
}
