package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1yr  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC43731yr extends AnonymousClass0PN {
    public final String A00;
    public final String A01;

    public AbstractC43731yr(String str, String str2, AnonymousClass0PQ r5) {
        super(AnonymousClass008.A0M("alter_", str, "_to_", str2), EditorInfoCompat.IME_FLAG_FORCE_ASCII, r5);
        this.A00 = str;
        this.A01 = str2;
        RunnableEBaseShape9S0100000_I1_4 runnableEBaseShape9S0100000_I1_4 = new RunnableEBaseShape9S0100000_I1_4(this, 26);
        List list = super.A00;
        if (list == null) {
            list = new ArrayList();
            super.A00 = list;
        }
        list.add(runnableEBaseShape9S0100000_I1_4);
    }
}
