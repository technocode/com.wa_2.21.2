package X;

import android.content.DialogInterface;
import com.whatsapp.Main;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.1IO  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IO implements DialogInterface.OnClickListener {
    public final /* synthetic */ Main A00;

    public /* synthetic */ AnonymousClass1IO(Main main) {
        this.A00 = main;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Main main = this.A00;
        try {
            boolean createNewFile = new File(main.A04.A01.A02, "WhatsApp.upgrade").createNewFile();
            StringBuilder sb = new StringBuilder();
            sb.append("upgrade sentinel file created; success=");
            sb.append(createNewFile);
            Log.i(sb.toString());
        } catch (IOException e) {
            Log.e("upgrade/sentinel/fail", e);
        }
        C002001d.A2N(main, 0);
        main.A0W();
    }
}
