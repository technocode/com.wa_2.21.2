package X;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;

/* renamed from: X.2nR  reason: invalid class name and case insensitive filesystem */
public class C59312nR extends AbstractC30161ar {
    public final /* synthetic */ StarredMessagesActivity A00;

    public int getViewTypeCount() {
        return 79;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59312nR(StarredMessagesActivity starredMessagesActivity) {
        super(starredMessagesActivity);
        this.A00 = starredMessagesActivity;
    }

    /* renamed from: A04 */
    public AbstractC007503q getItem(int i) {
        Cursor cursor = this.A02;
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.A00.A0J.A0J.A02(cursor);
    }

    public int getItemViewType(int i) {
        AbstractC007503q A04 = getItem(i);
        if (A04 != null) {
            return AnonymousClass2IG.A00(A04);
        }
        throw null;
    }

    @Override // X.AbstractC30161ar
    public View getView(int i, View view, ViewGroup viewGroup) {
        AbstractC51572Zg r8;
        StarredMessagesActivity starredMessagesActivity;
        C007003k r1;
        AbstractC007503q A04 = getItem(i);
        if (A04 != null) {
            if (view == null) {
                r8 = ((AnonymousClass2DW) this.A00).A02.A02(viewGroup.getContext(), A04);
            } else {
                r8 = (AbstractC51572Zg) view;
                r8.A0Z(A04, true);
            }
            ImageView imageView = (ImageView) r8.findViewById(R.id.profile_picture);
            AnonymousClass0Q7.A0W(imageView, 2);
            if (A04.A0n.A02) {
                starredMessagesActivity = this.A00;
                AnonymousClass01I r0 = starredMessagesActivity.A08;
                r0.A04();
                r1 = r0.A01;
                if (r1 == null) {
                    throw null;
                }
            } else {
                starredMessagesActivity = this.A00;
                AnonymousClass01A r12 = ((AnonymousClass2DW) starredMessagesActivity).A0F;
                UserJid A08 = A04.A08();
                if (A08 != null) {
                    r1 = r12.A0A(A08);
                } else {
                    throw null;
                }
            }
            starredMessagesActivity.A02.A02(r1, imageView);
            r8.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, A04, 24));
            if ((r8 instanceof C60432pQ) && ((AnonymousClass0ZE) r8.getFMessage()).A00) {
                C60432pQ r02 = (C60432pQ) r8;
                r02.A00 = true;
                StickerView stickerView = r02.A04.A0M;
                if (stickerView != null) {
                    stickerView.A02 = true;
                    stickerView.A00();
                }
            }
            return r8;
        }
        throw null;
    }
}
