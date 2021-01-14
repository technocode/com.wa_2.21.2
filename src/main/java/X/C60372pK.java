package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2pK  reason: invalid class name and case insensitive filesystem */
public class C60372pK extends AbstractC59032mw {
    public int A00 = 0;
    public AbstractView$OnClickListenerC08330av A01;
    public AbstractView$OnClickListenerC08330av A02;
    public AbstractView$OnClickListenerC08330av A03;
    public ArrayList A04;
    public boolean A05 = false;
    public boolean A06 = false;
    public final View A07;
    public final View A08;
    public final ImageView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final CircularProgressBar A0D;
    public final C04420Kh A0E;
    public final AnonymousClass0CH A0F;
    public final AnonymousClass2TJ A0G;
    public final AnonymousClass0D9 A0H;
    public final ArrayList A0I = new ArrayList();

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return 0;
    }

    @Override // X.AbstractC59032mw
    public int getMaxAlbumSize() {
        return 102;
    }

    @Override // X.AbstractC59032mw
    public int getMinAlbumSize() {
        return 4;
    }

    public C60372pK(Context context, AnonymousClass0M3 r9) {
        super(context, r9);
        AnonymousClass0CH A002;
        AnonymousClass2TJ A003;
        C04420Kh A004;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass0CH.A00();
        }
        this.A0F = A002;
        if (isInEditMode()) {
            A003 = null;
        } else {
            A003 = AnonymousClass2TJ.A00();
        }
        this.A0G = A003;
        if (isInEditMode()) {
            A004 = null;
        } else {
            A004 = C04420Kh.A00();
        }
        this.A0E = A004;
        this.A0H = new C51672Zq(this);
        this.A01 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 24);
        this.A03 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 25);
        this.A02 = new ViewOnClickCListenerShape12S0100000_I1_1(this, 26);
        this.A0C = (TextView) findViewById(R.id.more);
        this.A0I.add(new AnonymousClass2IF(this, findViewById(R.id.thumb_0), 0));
        this.A0I.add(new AnonymousClass2IF(this, findViewById(R.id.thumb_1), 1));
        this.A0I.add(new AnonymousClass2IF(this, findViewById(R.id.thumb_2), 2));
        this.A0I.add(new AnonymousClass2IF(this, findViewById(R.id.thumb_3), 3));
        AnonymousClass00E.A08(4 == this.A0I.size(), "wrong number of views");
        this.A07 = findViewById(R.id.control_btn);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        this.A0D = circularProgressBar;
        circularProgressBar.A0B = 0;
        this.A09 = (ImageView) findViewById(R.id.cancel_download);
        this.A08 = findViewById(R.id.control_frame);
        boolean z = r9.A0n.A02;
        if (!z) {
            this.A0B = (TextView) findViewById(R.id.download_size);
            this.A0A = (TextView) findViewById(R.id.download_item_count);
        } else {
            this.A0B = null;
            this.A0A = null;
        }
        this.A08.setBackgroundDrawable(new AnonymousClass0YH(C004302a.A00(getContext(), z ? R.color.bubble_color_outgoing : R.color.bubble_color_incoming)));
        A05(true);
    }

    private void A05(boolean z) {
        AnonymousClass01X r3;
        TextView textView;
        String A0A2;
        int i;
        TextView textView2;
        if (this.A04 != null) {
            if (z && (textView2 = this.A0B) != null) {
                textView2.setTag(null);
            }
            for (int i2 = 0; i2 < 4; i2++) {
                AnonymousClass2IF r32 = (AnonymousClass2IF) this.A0I.get(i2);
                AbstractC007503q r10 = (AbstractC007503q) this.A04.get(i2);
                TextView textView3 = r32.A02;
                C60372pK r6 = r32.A03;
                textView3.setText(AnonymousClass0OZ.A00(r6.A0n, r6.A0l.A06(r10.A0E)));
                r6.A0W(textView3, R.drawable.broadcast_status_icon_onmedia, r10);
                C02580Cq r9 = r6.A1E;
                ImageView imageView = r32.A00;
                AnonymousClass0D9 r12 = r6.A0H;
                StringBuilder A0S = AnonymousClass008.A0S("album-");
                C007303n r0 = r10.A0n;
                A0S.append(r0);
                r9.A0C(r10, imageView, r12, A0S.toString(), false, false);
                if (r0.A02 && r32.A01 != null) {
                    int i3 = r10.A08;
                    if (C12080hW.A00(i3, 13) >= 0) {
                        i = R.drawable.message_got_read_receipt_from_target_onmedia;
                    } else if (C12080hW.A00(i3, 5) >= 0) {
                        i = R.drawable.message_got_receipt_from_target_onmedia;
                    } else {
                        int A002 = C12080hW.A00(i3, 4);
                        i = R.drawable.message_unsent_onmedia;
                        if (A002 == 0) {
                            i = R.drawable.message_got_receipt_from_server_onmedia;
                        }
                    }
                    r32.A01.setImageResource(i);
                }
                AnonymousClass0Q7.A0g(r32.A00, AbstractC59162nB.A07(r10));
                AnonymousClass0Q7.A0g(r32.A02, AbstractC59162nB.A05(r10));
                ImageView imageView2 = r32.A01;
                if (imageView2 != null) {
                    AnonymousClass0Q7.A0g(imageView2, AbstractC59162nB.A06(r10));
                }
            }
            ArrayList arrayList = this.A0I;
            AnonymousClass2IF r1 = (AnonymousClass2IF) arrayList.get(3);
            if (this.A04.size() > arrayList.size()) {
                TextView textView4 = this.A0C;
                textView4.setVisibility(0);
                r3 = this.A0n;
                textView4.setText(r3.A0D(R.string.plus_n, Integer.valueOf((this.A04.size() - arrayList.size()) + 1)));
                r1.A02.setVisibility(8);
                ImageView imageView3 = r1.A01;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                int size = this.A04.size() - 4;
                ImageView imageView4 = r1.A00;
                C002001d.A2w(r3, imageView4, R.string.action_open_photo_album);
                imageView4.setContentDescription(r3.A0A(R.plurals.number_of_photos, (long) size, Integer.valueOf(size)));
            } else {
                this.A0C.setVisibility(8);
                r1.A02.setVisibility(0);
                ImageView imageView5 = r1.A01;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
                ImageView imageView6 = r1.A00;
                r3 = this.A0n;
                imageView6.setContentDescription(r3.A06(R.string.action_open_image));
                C002001d.A2j(imageView6);
            }
            ArrayList arrayList2 = this.A04;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AnonymousClass0M4 r02 = ((AnonymousClass0M3) it.next()).A02;
                    if (r02 != null) {
                        if (r02.A0a) {
                            View view = this.A08;
                            view.setVisibility(0);
                            CircularProgressBar circularProgressBar = this.A0D;
                            ImageView imageView7 = this.A09;
                            View view2 = this.A07;
                            AbstractC59162nB.A08(true, !z, false, view, circularProgressBar, imageView7, view2);
                            imageView7.setOnClickListener(this.A01);
                            view2.setOnClickListener(this.A01);
                            circularProgressBar.setOnClickListener(this.A01);
                            break;
                        }
                    } else {
                        throw null;
                    }
                }
            }
            ArrayList arrayList3 = this.A04;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AnonymousClass0M4 r03 = ((AnonymousClass0M3) it2.next()).A02;
                    if (r03 == null) {
                        throw null;
                    } else if (!r03.A0P) {
                        View view3 = this.A08;
                        view3.setVisibility(0);
                        CircularProgressBar circularProgressBar2 = this.A0D;
                        ImageView imageView8 = this.A09;
                        View view4 = this.A07;
                        AbstractC59162nB.A08(false, !z, false, view3, circularProgressBar2, imageView8, view4);
                        Iterator it3 = this.A04.iterator();
                        int i4 = 0;
                        int i5 = 0;
                        while (it3.hasNext()) {
                            AnonymousClass0M3 r102 = (AnonymousClass0M3) it3.next();
                            AnonymousClass0M4 r13 = r102.A02;
                            if (r13 == null) {
                                throw null;
                            } else if (!r13.A0P && !r13.A0a) {
                                if (AnonymousClass0FI.A0p(r102)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                        if (!super.getFMessage().A0n.A02 || i4 == i5) {
                            this.A00 = 0;
                            this.A06 = false;
                            this.A05 = false;
                            long j = 0;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = this.A04.iterator();
                            while (it4.hasNext()) {
                                AnonymousClass0M3 r11 = (AnonymousClass0M3) it4.next();
                                AnonymousClass0M4 r62 = r11.A02;
                                if (r62 == null) {
                                    throw null;
                                } else if (!r62.A0P && !r62.A0a) {
                                    arrayList4.add(r11);
                                    this.A00++;
                                    j += r11.A01;
                                    boolean z2 = this.A05;
                                    byte b = r11.A0m;
                                    boolean z3 = false;
                                    if (b == 1) {
                                        z3 = true;
                                    }
                                    this.A05 = z2 | z3;
                                    boolean z4 = this.A06;
                                    boolean z5 = false;
                                    if (b == 3) {
                                        z5 = true;
                                    }
                                    this.A06 = z5 | z4;
                                }
                            }
                            TextView textView5 = this.A0B;
                            if (textView5 != null && (textView = this.A0A) != null) {
                                textView5.setTag(arrayList4);
                                A0X(textView5, arrayList4, j);
                                if (this.A00 == 0) {
                                    textView.setVisibility(8);
                                } else {
                                    textView.setVisibility(0);
                                    if (!this.A05) {
                                        int i6 = this.A00;
                                        A0A2 = r3.A0A(R.plurals.number_of_videos, (long) i6, Integer.valueOf(i6));
                                    } else if (!this.A06) {
                                        int i7 = this.A00;
                                        A0A2 = r3.A0A(R.plurals.number_of_photos, (long) i7, Integer.valueOf(i7));
                                    } else {
                                        int i8 = this.A00;
                                        A0A2 = r3.A0A(R.plurals.number_of_items, (long) i8, Integer.valueOf(i8));
                                    }
                                    textView.setText(A0A2);
                                }
                                view4.setOnClickListener(this.A02);
                            }
                        } else {
                            if (view4 instanceof TextView) {
                                TextView textView6 = (TextView) view4;
                                textView6.setText(r3.A06(R.string.retry));
                                textView6.setCompoundDrawablesWithIntrinsicBounds(R.drawable.btn_upload_dark, 0, 0, 0);
                            }
                            view4.setOnClickListener(this.A03);
                        }
                    }
                }
            }
            View view5 = this.A08;
            view5.setVisibility(8);
            AbstractC59162nB.A08(false, false, false, view5, this.A0D, this.A09, this.A07);
            A0O();
        }
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        return AnonymousClass0FI.A0j(super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0J() {
        AbstractC007503q fMessage = super.getFMessage();
        AbstractC43421yL rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            rowsContainer.AQ6(fMessage);
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                AbstractC007503q r2 = (AbstractC007503q) it.next();
                if (!r2.A0n.equals(fMessage.A0n)) {
                    rowsContainer.AQh(r2);
                }
            }
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A05(false);
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0N() {
        AbstractC43421yL rowsContainer = getRowsContainer();
        if (rowsContainer != null) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                rowsContainer.AQh((AbstractC007503q) it.next());
            }
            ((AbstractC51572Zg) this).A0G.setRowSelected(rowsContainer.ABK(super.getFMessage()));
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r2, boolean z) {
        super.A0Z(super.getFMessage(), z);
        if (z) {
            A05(false);
        }
    }

    @Override // X.AbstractC59032mw
    public void A0j(ArrayList arrayList, boolean z) {
        boolean z2 = false;
        if (super.getFMessage() != arrayList.get(0)) {
            z2 = true;
        }
        if (!z) {
            ArrayList arrayList2 = this.A04;
            if (arrayList2 != null && arrayList2.size() == arrayList.size()) {
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        if (arrayList2.get(i) != arrayList.get(i)) {
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            z = true;
        }
        this.A04 = arrayList;
        super.A0Z((AbstractC007503q) arrayList.get(0), z);
        if (z2 || z) {
            A05(z2);
        }
    }

    public final Intent A0k() {
        AnonymousClass02N r0;
        Intent intent = new Intent(getContext(), MediaAlbumActivity.class);
        long[] jArr = new long[this.A04.size()];
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A04;
            if (i >= arrayList.size()) {
                break;
            }
            jArr[i] = ((AbstractC007503q) arrayList.get(i)).A0p;
            i++;
        }
        intent.putExtra("message_ids", jArr);
        AbstractC007503q fMessage = super.getFMessage();
        C007303n r1 = fMessage.A0n;
        if (!r1.A02) {
            AnonymousClass02N r12 = r1.A00;
            if (!AnonymousClass1VY.A0Y(r12) || (r0 = fMessage.A0G) == null) {
                r0 = r12;
            }
        } else {
            r0 = null;
        }
        intent.putExtra("jid", AnonymousClass1VY.A0D(r0));
        return intent;
    }

    @Override // X.AnonymousClass2I2
    public AnonymousClass0M3 getFMessage() {
        return (AnonymousClass0M3) super.getFMessage();
    }

    @Override // X.AbstractC51572Zg
    public int getForwardedTextAnchorId() {
        return R.id.media_container;
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_album_left;
    }

    @Override // X.AnonymousClass2I2
    public int getMainChildMaxWidth() {
        return (AbstractC59162nB.A04(getContext()) * 72) / 100;
    }

    @Override // X.AbstractC51572Zg, X.AbstractC59032mw
    public int getMessageCount() {
        ArrayList arrayList = this.A04;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_album_right;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0M3);
        super.setFMessage(r2);
    }
}
