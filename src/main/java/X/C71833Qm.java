package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.stickers.StickerStoreTabFragment;

/* renamed from: X.3Qm  reason: invalid class name and case insensitive filesystem */
public class C71833Qm extends AbstractC11910hD {
    public AnonymousClass3QO A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final ImageView A06;
    public final ImageView A07;
    public final ProgressBar A08;
    public final ProgressBar A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final GridLayoutManager A0E;
    public final RecyclerView A0F;
    public final CircularProgressBar A0G;

    public C71833Qm(StickerStoreTabFragment stickerStoreTabFragment, View view) {
        super(view);
        this.A02 = view;
        this.A0C = (TextView) view.findViewById(R.id.sticker_pack_title);
        this.A0A = (TextView) view.findViewById(R.id.sticker_pack_author);
        this.A0B = (TextView) view.findViewById(R.id.sticker_pack_filesize);
        this.A06 = (ImageView) view.findViewById(R.id.button_one);
        this.A07 = (ImageView) view.findViewById(R.id.button_two);
        this.A08 = (ProgressBar) view.findViewById(R.id.pack_download_progress);
        this.A0F = (RecyclerView) view.findViewById(R.id.sticker_row_recycler);
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(stickerStoreTabFragment.A00);
        this.A0E = gridLayoutManager;
        gridLayoutManager.A1A(1);
        this.A0F.setLayoutManager(this.A0E);
        this.A01 = view.findViewById(R.id.bullet_file_size);
        this.A04 = view.findViewById(R.id.sticker_update_button);
        this.A0D = (TextView) view.findViewById(R.id.sticker_update_text);
        this.A09 = (ProgressBar) view.findViewById(R.id.pack_update_progress);
        this.A0G = (CircularProgressBar) view.findViewById(R.id.sticker_row_loading);
        this.A03 = view.findViewById(R.id.new_pack_badge);
        this.A05 = (ImageView) view.findViewById(R.id.sticker_animationlist);
        C002301g.A03(this.A0D);
    }
}
