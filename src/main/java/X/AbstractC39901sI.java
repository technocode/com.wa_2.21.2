package X;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.LinksGalleryFragment;
import com.whatsapp.gallery.ProductGalleryFragment;
import java.io.File;
import java.math.BigDecimal;
import java.util.Locale;

/* renamed from: X.1sI  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC39901sI extends AbstractC16300pa {
    public int A00 = -1;
    public Cursor A01 = null;
    public DataSetObserver A02 = new AnonymousClass1LN(this);
    public boolean A03 = false;

    public AbstractC39901sI() {
        super.A04(true);
    }

    @Override // X.AbstractC16300pa
    public void A04(boolean z) {
        super.A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        Cursor cursor;
        if (!this.A03 || (cursor = this.A01) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r15, int i) {
        AnonymousClass0Z9 r4;
        String str;
        int length;
        String str2;
        String A06;
        if (!this.A03) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.A01.moveToPosition(i)) {
            Cursor cursor = this.A01;
            if (this instanceof C59602nz) {
                C53882dz r152 = (C53882dz) r15;
                ProductGalleryFragment productGalleryFragment = ((C59602nz) this).A02;
                AbstractC007503q A032 = productGalleryFragment.A03.A0J.A03(cursor, ((GalleryFragmentBase) productGalleryFragment).A07);
                if (A032 != null) {
                    r152.A00 = A032;
                    if (A032 instanceof AnonymousClass0Z9) {
                        r4 = (AnonymousClass0Z9) A032;
                    } else {
                        AbstractC007503q A09 = A032.A09();
                        if (A09 instanceof AnonymousClass0Z9) {
                            r4 = (AnonymousClass0Z9) A09;
                            if (!r4.A0n.A01.startsWith("product_inquiry")) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (r4 != null) {
                        View view = r152.A0H;
                        view.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(r152, r4, 45));
                        view.setOnLongClickListener(new AnonymousClass2OZ(r152));
                        String str3 = r4.A07;
                        BigDecimal bigDecimal = r4.A08;
                        if (bigDecimal == null || (str2 = r4.A02) == null) {
                            str = r4.A03;
                        } else {
                            str = new C05910Qz(str2).A03(r152.A04.A02, bigDecimal, true);
                        }
                        StringBuilder sb = new StringBuilder();
                        String str4 = "";
                        String str5 = str3;
                        if (str3 == null) {
                            str5 = str4;
                        }
                        sb.append(str5);
                        if (!TextUtils.isEmpty(str)) {
                            StringBuilder sb2 = new StringBuilder();
                            if (str3 != null) {
                                str4 = "\n";
                            }
                            str4 = AnonymousClass008.A0O(sb2, str4, str);
                        }
                        sb.append(str4);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                        if (!TextUtils.isEmpty(str)) {
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C004302a.A00(r152.A03.getContext(), R.color.secondary_text));
                            if (str3 == null) {
                                length = 0;
                            } else {
                                length = str3.length();
                            }
                            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 0);
                        }
                        ProductGalleryFragment productGalleryFragment2 = r152.A04;
                        r152.A03.setText(AbstractC11890hA.A02(productGalleryFragment2.A00(), spannableStringBuilder, productGalleryFragment2.A0o().A8u(), productGalleryFragment2.A02));
                        if (((AnonymousClass0M3) r4).A02 != null) {
                            productGalleryFragment2.A06.A09(r4, r152.A02, new C53872dy(r152));
                        } else {
                            ImageView imageView = r152.A02;
                            imageView.setVisibility(0);
                            imageView.setImageResource(R.drawable.ic_business);
                            imageView.setBackgroundColor(C004302a.A00(imageView.getContext(), R.color.media_link_thumbnail_background));
                            imageView.setScaleType(ImageView.ScaleType.CENTER);
                        }
                        View view2 = r152.A01;
                        int i2 = 8;
                        if (r152.A00.A0j) {
                            i2 = 0;
                        }
                        view2.setVisibility(i2);
                        if (productGalleryFragment2.A0o().ABK(r152.A00)) {
                            ((FrameLayout) view).setForeground(new ColorDrawable(C004302a.A00(productGalleryFragment2.A00(), R.color.multi_selection)));
                            view.setSelected(true);
                            return;
                        }
                        ((FrameLayout) view).setForeground(null);
                        view.setSelected(false);
                        return;
                    }
                    return;
                }
                throw null;
            } else if (!(this instanceof C59572nw)) {
                C53682df r153 = (C53682df) r15;
                AnonymousClass0M3 A002 = ((C47942Kh) cursor).A00();
                if (A002 != null) {
                    AnonymousClass0M2 r6 = (AnonymousClass0M2) A002;
                    r153.A00 = r6;
                    ImageView imageView2 = r153.A04;
                    DocumentsGalleryFragment documentsGalleryFragment = r153.A0A;
                    imageView2.setImageDrawable(AnonymousClass0ZD.A03(documentsGalleryFragment.A00(), r6));
                    if (TextUtils.isEmpty(((AnonymousClass0M3) r6).A04)) {
                        TextView textView = r153.A08;
                        if (!TextUtils.isEmpty(r6.A0w())) {
                            A06 = C006803i.A0L(r6.A0w());
                        } else {
                            A06 = ((GalleryFragmentBase) documentsGalleryFragment).A0A.A06(R.string.untitled_document);
                        }
                        textView.setText(A06);
                    } else {
                        r153.A08.setText(AbstractC11890hA.A02(documentsGalleryFragment.A00(), ((AnonymousClass0M3) r6).A04, documentsGalleryFragment.A0o().A8u(), ((GalleryFragmentBase) documentsGalleryFragment).A0A));
                    }
                    AnonymousClass0M4 r0 = ((AnonymousClass0M3) r6).A02;
                    if (r0 != null) {
                        File file = r0.A0F;
                        int i3 = 8;
                        TextView textView2 = r153.A07;
                        if (file != null) {
                            textView2.setText(C002001d.A1Y(((GalleryFragmentBase) documentsGalleryFragment).A0A, file.length()));
                            textView2.setVisibility(0);
                            r153.A02.setVisibility(0);
                        } else {
                            textView2.setVisibility(8);
                            r153.A02.setVisibility(8);
                        }
                        if (r6.A00 != 0) {
                            TextView textView3 = r153.A06;
                            textView3.setVisibility(0);
                            r153.A01.setVisibility(0);
                            textView3.setText(AnonymousClass0ZD.A06(((GalleryFragmentBase) documentsGalleryFragment).A0A, ((AnonymousClass0M3) r6).A07, r6.A00));
                        } else {
                            r153.A06.setVisibility(8);
                            r153.A01.setVisibility(8);
                        }
                        String upperCase = C02220Bc.A01(((AnonymousClass0M3) r6).A07).toUpperCase(Locale.US);
                        if (TextUtils.isEmpty(upperCase) && !TextUtils.isEmpty(r6.A0w())) {
                            String A0w = r6.A0w();
                            if (A0w != null) {
                                upperCase = C006803i.A0K(A0w).toUpperCase(Locale.US);
                            } else {
                                throw null;
                            }
                        }
                        r153.A09.setText(upperCase);
                        if (file != null) {
                            TextView textView4 = r153.A05;
                            AnonymousClass01X r7 = ((GalleryFragmentBase) documentsGalleryFragment).A0A;
                            textView4.setText(C002001d.A1e(r7, r6.A0E, false));
                            textView4.setContentDescription(C002001d.A1e(r7, r6.A0E, true));
                        } else {
                            TextView textView5 = r153.A05;
                            textView5.setText("");
                            textView5.setContentDescription("");
                        }
                        View view3 = r153.A03;
                        if (r6.A0j) {
                            i3 = 0;
                        }
                        view3.setVisibility(i3);
                        if (documentsGalleryFragment.A0o().ABK(r6)) {
                            View view4 = r153.A0H;
                            Context A003 = documentsGalleryFragment.A00();
                            if (A003 != null) {
                                view4.setBackgroundColor(C004302a.A00(A003, R.color.multi_selection));
                                view4.setSelected(true);
                                return;
                            }
                            throw null;
                        }
                        View view5 = r153.A0H;
                        view5.setBackgroundResource(R.drawable.selector_orange_gradient);
                        view5.setSelected(false);
                        return;
                    }
                    throw null;
                }
                throw null;
            } else {
                C53732dk r154 = (C53732dk) r15;
                int i4 = cursor.getInt(cursor.getColumnIndex("link_index"));
                LinksGalleryFragment linksGalleryFragment = ((C59572nw) this).A00;
                int i5 = 0;
                AbstractC007503q A033 = ((GalleryFragmentBase) linksGalleryFragment).A0B.A0J.A03(cursor, ((GalleryFragmentBase) linksGalleryFragment).A07);
                r154.A01 = A033;
                C12030hR r02 = r154.A00;
                if (r02 != null) {
                    ((AbstractCallableC12020hQ) r02).A00.A01();
                }
                TextView textView6 = r154.A07;
                textView6.setText("");
                r154.A09.setText("");
                r154.A06.setVisibility(8);
                View view6 = r154.A05;
                view6.setVisibility(8);
                r154.A0A.setVisibility(8);
                TextView textView7 = r154.A08;
                textView7.setVisibility(8);
                LinksGalleryFragment linksGalleryFragment2 = r154.A0B;
                if (linksGalleryFragment2.A0o().ABK(A033)) {
                    View view7 = r154.A0H;
                    ((FrameLayout) view7).setForeground(new ColorDrawable(C004302a.A00(linksGalleryFragment2.A00(), R.color.multi_selection)));
                    view7.setSelected(true);
                } else {
                    View view8 = r154.A0H;
                    ((FrameLayout) view8).setForeground(null);
                    view8.setSelected(false);
                }
                int i6 = 0;
                if (r154.A03 == null) {
                    i6 = 8;
                }
                textView7.setVisibility(i6);
                if (!A033.A0j) {
                    i5 = 8;
                }
                view6.setVisibility(i5);
                C09030cB r42 = linksGalleryFragment2.A00;
                C12030hR r5 = new C12030hR(linksGalleryFragment2.A01(), linksGalleryFragment2.A04, ((GalleryFragmentBase) linksGalleryFragment2).A0A, linksGalleryFragment2.A03, i4, A033, textView6, linksGalleryFragment2.A0o().A8u());
                r154.A00 = r5;
                r42.A01.execute(new RunnableEBaseShape0S0300000_I0_0(r42, r5, new C53632da(r154), 20));
            }
        } else {
            throw new IllegalStateException(AnonymousClass008.A0F("couldn't move cursor to position ", i));
        }
    }

    public Cursor A08(Cursor cursor) {
        DataSetObserver dataSetObserver;
        Cursor cursor2 = this.A01;
        if (cursor == cursor2) {
            return null;
        }
        if (!(cursor2 == null || (dataSetObserver = this.A02) == null)) {
            cursor2.unregisterDataSetObserver(dataSetObserver);
        }
        this.A01 = cursor;
        if (cursor != null) {
            DataSetObserver dataSetObserver2 = this.A02;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.A00 = cursor.getColumnIndexOrThrow("_id");
            this.A03 = true;
            super.A01.A00();
            return cursor2;
        }
        this.A00 = -1;
        this.A03 = false;
        super.A01.A00();
        return cursor2;
    }
}
