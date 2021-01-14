package X;

import android.content.DialogInterface;
import com.whatsapp.group.NewGroup;
import java.util.List;

/* renamed from: X.2QT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QT implements DialogInterface.OnClickListener {
    public final /* synthetic */ NewGroup A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ AnonymousClass2QT(NewGroup newGroup, List list) {
        this.A00 = newGroup;
        this.A01 = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A0T(this.A01);
    }
}
