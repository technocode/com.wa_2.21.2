package X;

import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2am  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52222am implements AbstractC47722Jh {
    public final /* synthetic */ ConversationsFragment A00;

    public /* synthetic */ C52222am(ConversationsFragment conversationsFragment) {
        this.A00 = conversationsFragment;
    }

    @Override // X.AbstractC47722Jh
    public final void A1d(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        ConversationsFragment conversationsFragment = this.A00;
        ActivityC004902h A0A = conversationsFragment.A0A();
        if (A0A != null) {
            C36901n6 A002 = C36901n6.A00(A0A.findViewById(R.id.pager_holder), charSequence, 0);
            A002.A06(charSequence2, onClickListener);
            A002.A05(C004302a.A00(A0A, R.color.bulkArchiveSnackbarButton));
            C59372nX r1 = new C59372nX(conversationsFragment, A0A);
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
    }
}
