package X;

import android.graphics.Bitmap;
import android.util.Pair;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.0eO  reason: invalid class name and case insensitive filesystem */
public class C10290eO extends AnonymousClass0JW {
    public final AnonymousClass0HK A00 = AnonymousClass0HK.A00();
    public final C007003k A01;
    public final WeakReference A02;

    public C10290eO(InviteGroupParticipantsActivity inviteGroupParticipantsActivity, C007003k r3) {
        this.A02 = new WeakReference(inviteGroupParticipantsActivity);
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.first;
        byte[] bArr = (byte[]) pair.second;
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A02.get();
        if (inviteGroupParticipantsActivity != null) {
            inviteGroupParticipantsActivity.A06 = bArr;
            ImageView imageView = inviteGroupParticipantsActivity.A01;
            if (bitmap == null) {
                imageView.setImageResource(R.drawable.avatar_group);
            } else {
                imageView.setImageBitmap(bitmap);
            }
        }
    }
}
