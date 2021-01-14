package X;

import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2nO  reason: invalid class name and case insensitive filesystem */
public class C59282nO extends AbstractC51922aG {
    public final /* synthetic */ MediaAlbumActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59282nO(MediaAlbumActivity mediaAlbumActivity, ActivityC004802g r29, AnonymousClass02M r30, AnonymousClass0Z6 r31, AnonymousClass320 r32, AnonymousClass01I r33, AnonymousClass00T r34, AnonymousClass325 r35, AnonymousClass00Y r36, C000300f r37, AnonymousClass0DH r38, C04360Kb r39, AbstractC658531u r40, C02780Dk r41, AnonymousClass01A r42, AnonymousClass03P r43, C014308b r44, AnonymousClass01X r45, AnonymousClass0EO r46, AnonymousClass31y r47, AnonymousClass322 r48, AnonymousClass0CG r49, AnonymousClass0CH r50, C04420Kh r51, AnonymousClass01T r52, AnonymousClass022 r53) {
        super(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53);
        this.A00 = mediaAlbumActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (r3.A01((X.AnonymousClass02X) r6).A0A(r3.A01) != false) goto L_0x003f;
     */
    @Override // X.AbstractC06100Rs, X.AbstractC51922aG
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ACa(X.AbstractC06110Rt r10, android.view.MenuItem r11) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59282nO.ACa(X.0Rt, android.view.MenuItem):boolean");
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r4) {
        Log.i("starred/selectionended");
        Log.i("conversation/selectionended");
        MediaAlbumActivity mediaAlbumActivity = this.A00;
        C47612Is r0 = ((AnonymousClass2DW) mediaAlbumActivity).A03;
        if (r0 != null) {
            r0.A00();
            ((AnonymousClass2DW) mediaAlbumActivity).A03 = null;
        }
        mediaAlbumActivity.A02.notifyDataSetChanged();
        ((AnonymousClass2DW) mediaAlbumActivity).A00 = null;
    }
}
