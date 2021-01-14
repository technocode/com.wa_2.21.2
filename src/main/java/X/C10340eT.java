package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupChatInfo;
import java.lang.ref.WeakReference;

/* renamed from: X.0eT  reason: invalid class name and case insensitive filesystem */
public class C10340eT extends AnonymousClass0JW {
    public final AnonymousClass0HK A00 = AnonymousClass0HK.A00();
    public final C007003k A01;
    public final WeakReference A02;

    public C10340eT(GroupChatInfo groupChatInfo, C007003k r3) {
        this.A02 = new WeakReference(groupChatInfo);
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        GroupChatInfo groupChatInfo = (GroupChatInfo) this.A02.get();
        if (groupChatInfo != null) {
            if (bitmap != null) {
                groupChatInfo.A0c(bitmap);
            } else {
                groupChatInfo.A0Z(R.drawable.avatar_group_large, R.color.avatar_group_large);
            }
            if (C40411tE.A00(groupChatInfo.A0g())) {
                groupChatInfo.A0A.setVisibility(0);
            }
        }
    }
}
