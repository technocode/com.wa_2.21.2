package java.lang;

import X.AbstractC000400g;
import X.AbstractC24951Dr;
import X.ActivityC004902h;
import X.AnonymousClass01X;
import X.AnonymousClass2KK;
import X.C004302a;
import X.C36901n6;
import X.C52312av;
import X.C59372nX;
import X.C60602pn;
import X.ViewTreeObserver$OnGlobalLayoutListenerC47692Je;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RunnableEBaseShape1S0301000_I1 extends RunnableEmptyBase implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableEBaseShape1S0301000_I1(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void run() {
        switch (this.A04) {
            case 0:
                C52312av r9 = (C52312av) this.A01;
                int i = this.A00;
                Object obj = this.A02;
                Object obj2 = this.A03;
                ConversationsFragment conversationsFragment = r9.A0F;
                AnonymousClass01X r10 = conversationsFragment.A19;
                boolean A0D = conversationsFragment.A0g.A0D(AbstractC000400g.A0p);
                int i2 = R.plurals.bulk_conversations_archived_confirmation;
                if (A0D) {
                    i2 = R.plurals.conversations_moved_to_read_later_confirmation;
                }
                String A0A = r10.A0A(i2, (long) i, Integer.valueOf(i));
                String A06 = r10.A06(R.string.undo);
                ViewOnClickEBaseShape1S0300000_I1 viewOnClickEBaseShape1S0300000_I1 = new ViewOnClickEBaseShape1S0300000_I1(r9, obj, obj2, 11);
                ActivityC004902h A0A2 = conversationsFragment.A0A();
                if (A0A2 != null) {
                    C36901n6 A002 = C36901n6.A00(A0A2.findViewById(R.id.pager_holder), A0A, 0);
                    A002.A06(A06, viewOnClickEBaseShape1S0300000_I1);
                    A002.A05(C004302a.A00(A0A2, R.color.bulkArchiveSnackbarButton));
                    C59372nX r1 = new C59372nX(conversationsFragment, A0A2);
                    List list = ((AbstractC24951Dr) A002).A01;
                    if (list == null) {
                        list = new ArrayList();
                        ((AbstractC24951Dr) A002).A01 = list;
                    }
                    list.add(r1);
                    conversationsFragment.A0D = A002;
                    A002.A05.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC47692Je(conversationsFragment));
                    conversationsFragment.A0D.A04();
                    return;
                }
                throw null;
            case 1:
                ((C60602pn) this.A01).A0B(this.A00, (File) this.A02, (AnonymousClass2KK) this.A03);
                Log.d("MediaDownload/ProgressiveJpeg/generatedThumbnail");
                return;
            default:
                return;
        }
    }
}
