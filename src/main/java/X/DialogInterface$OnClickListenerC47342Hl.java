package X;

import android.content.DialogInterface;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.util.List;

/* renamed from: X.2Hl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47342Hl implements DialogInterface.OnClickListener {
    public final /* synthetic */ ViewOnClickCListenerShape12S0100000_I1_1 A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ DialogInterface$OnClickListenerC47342Hl(ViewOnClickCListenerShape12S0100000_I1_1 viewOnClickCListenerShape12S0100000_I1_1, List list) {
        this.A00 = viewOnClickCListenerShape12S0100000_I1_1;
        this.A01 = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ViewOnClickCListenerShape12S0100000_I1_1 viewOnClickCListenerShape12S0100000_I1_1 = this.A00;
        List list = this.A01;
        int size = ((C59052my) viewOnClickCListenerShape12S0100000_I1_1.A00).A0Q.size();
        String str = (String) list.get(i);
        if (i < size) {
            viewOnClickCListenerShape12S0100000_I1_1.A02(str);
        } else {
            viewOnClickCListenerShape12S0100000_I1_1.A01(str);
        }
    }
}
