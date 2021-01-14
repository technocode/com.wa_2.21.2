package X;

import android.view.View;
import com.whatsapp.Conversation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1sD  reason: invalid class name and case insensitive filesystem */
public class C39851sD extends AnonymousClass0JW {
    public boolean A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass01K A04 = AnonymousClass01K.A00();
    public final AnonymousClass095 A05 = AnonymousClass095.A00();
    public final AnonymousClass02N A06;
    public final WeakReference A07;

    public C39851sD(Conversation conversation, AnonymousClass02N r4, long j, long j2) {
        this.A07 = new WeakReference(conversation);
        this.A06 = r4;
        this.A03 = j;
        this.A01 = 100;
        this.A02 = j2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        int top;
        C28511Up r6 = (C28511Up) obj;
        Conversation conversation = (Conversation) this.A07.get();
        if (conversation != null) {
            boolean z = this.A00;
            int firstVisiblePosition = conversation.A0Y.getFirstVisiblePosition();
            int count = conversation.A0q.getCount();
            int i = 0;
            View childAt = conversation.A0Y.getChildAt(0);
            if (childAt == null) {
                top = 0;
            } else {
                top = childAt.getTop();
            }
            if (r6.A00.moveToFirst()) {
                AnonymousClass01K r0 = conversation.A33;
                AbstractC007503q A032 = r0.A0J.A03(r6.A00, conversation.A14);
                if (A032 != null) {
                    ArrayList arrayList = conversation.A0q.A0N;
                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC007503q r10 = (AbstractC007503q) it.next();
                        if (r10.A0p != 0 && r10.A0p <= A032.A0p) {
                            arrayList2.add(r10);
                        }
                    }
                    arrayList.removeAll(arrayList2);
                } else {
                    throw null;
                }
            }
            conversation.A0q.A0H.clear();
            conversation.A0A = r6.A01;
            conversation.A0q.changeCursor(r6.A00);
            int count2 = (conversation.A0q.getCount() - count) + firstVisiblePosition;
            conversation.A10(count2, top);
            conversation.A1W = z;
            conversation.A01 = count2;
            conversation.A02 = top;
            StringBuilder A0S = AnonymousClass008.A0S("conversation/loaded-more/cursor:");
            A0S.append(r6.A00.getCount());
            A0S.append(" appended:");
            A0S.append(conversation.A0q.A0N.size());
            A0S.append(" more:");
            AnonymousClass008.A1a(A0S, conversation.A1W);
            View view = conversation.A0v.A00;
            if (!conversation.A1W) {
                i = 8;
            }
            view.setVisibility(i);
            conversation.A0i = null;
        }
    }
}
