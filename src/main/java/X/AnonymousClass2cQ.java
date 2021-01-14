package X;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.doodle.shapepicker.ShapeItemView;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2cQ  reason: invalid class name */
public class AnonymousClass2cQ extends AbstractC16300pa implements AnonymousClass2Q8 {
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass2Q9 A02;
    public String A03;
    public LinkedHashMap A04 = new LinkedHashMap();
    public List A05 = new ArrayList();
    public boolean A06;
    public final /* synthetic */ C48522Mp A07;

    public AnonymousClass2cQ(C48522Mp r2) {
        this.A07 = r2;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A05.size() + ((this.A07.A01 == 0 && this.A03 == null) ? this.A01 + (this.A06 ? 1 : 0) : 0);
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new C53092cP(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_grid_item, viewGroup, false));
        }
        if (i == 1) {
            boolean z = this.A07.A0m;
            int i2 = R.layout.shape_picker_section;
            if (z) {
                i2 = R.layout.shape_picker_v2_section;
            }
            return new AnonymousClass2cO(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
        } else if (i == 2) {
            return new C53082cN(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_no_results, viewGroup, false));
        } else {
            if (i == 3) {
                return new C53062cL(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_loading_section, viewGroup, false));
            }
            if (i == 4) {
                return new C53072cM(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.shape_picker_sticker_packs_loading, viewGroup, false));
            }
            AnonymousClass008.A0u("shapepicker/onCreateViewHolder/invalid state ", i);
            return null;
        }
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r12, int i) {
        int intValue;
        Drawable drawable;
        Drawable drawable2;
        C48472Mj A08 = A08(i);
        int i2 = A08.A02;
        int i3 = 0;
        if (i2 == 0) {
            C53092cP r1 = (C53092cP) r12;
            ShapeItemView shapeItemView = r1.A01;
            AbstractC48432Mf r4 = A08.A03;
            if (r4 != null) {
                C48522Mp r3 = this.A07;
                AnonymousClass01X r2 = r3.A0T;
                shapeItemView.setContentDescription(r4.A5S(r2));
                r1.A00 = r4;
                shapeItemView.A00 = r4.A9J();
                AbstractC48432Mf r13 = r1.A00;
                if (r13.AMt()) {
                    Reference reference = (Reference) r3.A0j.get(r4.A9J());
                    if (reference == null) {
                        drawable = null;
                    } else {
                        drawable = (Drawable) reference.get();
                    }
                    if (drawable == null) {
                        drawable2 = new C48482Mk();
                    } else {
                        drawable2 = drawable;
                    }
                    shapeItemView.setImageDrawable(drawable2);
                    if (drawable == null) {
                        Message obtain = Message.obtain(r3.A07, 0, 0, 0, shapeItemView);
                        String A9J = r4.A9J();
                        Bundle bundle = new Bundle();
                        bundle.putString("tag_bundle_key", A9J);
                        obtain.setData(bundle);
                        r3.A07.sendMessageAtFrontOfQueue(obtain);
                    }
                } else {
                    AbstractC48582Mw A3S = r13.A3S(shapeItemView.getContext(), r2, true);
                    A3S.A08(r3.A02);
                    if (A3S.A0C()) {
                        A3S.A06(r3.A00);
                    }
                    shapeItemView.setImageDrawable(new AnonymousClass2Ml(A3S, r3.A0m));
                }
                Pair A10 = r3.A0Z.A10();
                int i4 = A08.A00;
                if (i4 == 0) {
                    intValue = ((Number) A10.first).intValue();
                } else {
                    intValue = ((Number) A10.second).intValue();
                }
                int i5 = A08.A01 % intValue;
                boolean z = r3.A0m;
                if (!z) {
                    i3 = r4.A7q(r3.A0F, i4);
                }
                int i6 = i3 << 1;
                int min = Math.min(i6, r3.A0F.getResources().getDimensionPixelSize(R.dimen.doodle_shape_picker_custom_grid_padding));
                if (!z) {
                    if (A08.A01 >= 0) {
                        if (i5 == 0) {
                            shapeItemView.setPadding(min, i3, i6 - min, i3);
                            ((LinearLayout) r12.A0H).setGravity(19);
                            return;
                        } else if (i5 == intValue - 1) {
                            shapeItemView.setPadding(i6 - min, i3, min, i3);
                            ((LinearLayout) r12.A0H).setGravity(21);
                            return;
                        }
                    }
                    shapeItemView.setPadding(i3, i3, i3, i3);
                    ((LinearLayout) r12.A0H).setGravity(17);
                    return;
                }
                return;
            }
            throw null;
        } else if (i2 == 1) {
            ((AnonymousClass2cO) r12).A00.setText(A08.A04);
        } else if (i2 == 2) {
            C48522Mp r5 = this.A07;
            BitmapDrawable A012 = r5.A0b.A01(r5.A0F, -1, new AnonymousClass2d1(new int[]{129335}));
            C53082cN r122 = (C53082cN) r12;
            r122.A01.setText(r5.A0T.A0D(R.string.stickers_no_results, A08.A04));
            r122.A00.setImageDrawable(A012);
        } else if (i2 != 3 && i2 != 4) {
            StringBuilder A0S = AnonymousClass008.A0S("shapepicker/onBindViewHolder/invalid state ");
            A0S.append(i2);
            Log.e(A0S.toString());
        }
    }

    public final C48472Mj A08(int i) {
        if (i < this.A05.size()) {
            return (C48472Mj) this.A05.get(i);
        }
        if (this.A06 && i == A05() - 1) {
            return new C48472Mj(4);
        }
        int size = i - this.A05.size();
        for (List list : this.A04.values()) {
            if (size < list.size()) {
                return (C48472Mj) list.get(size);
            }
            size -= list.size();
        }
        throw new IllegalArgumentException(AnonymousClass008.A0G("Could not translate adapter position ", i, " to a grid item."));
    }

    public final List A09(AnonymousClass33N r6) {
        Collection collection = (Collection) this.A07.A0h.get(r6.A0D);
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C48472Mj(r6.A0F, 1));
            C48522Mp.A02(arrayList, collection);
            return arrayList;
        }
        throw null;
    }

    public void A0A() {
        ArrayList arrayList;
        int size = this.A05.size();
        this.A05.clear();
        C16310pb r4 = super.A01;
        r4.A03(0, size);
        C48522Mp r7 = this.A07;
        int i = this.A00 << 1;
        boolean z = r7.A0m;
        boolean z2 = true;
        if (z) {
            int i2 = r7.A01;
            if (i2 == 0 || i2 == 2) {
                arrayList = new ArrayList();
                if (z) {
                    C53342cv r10 = r7.A0A;
                    if (r10 != null && !r10.A01) {
                        r10.A01 = true;
                        C53322ct r6 = r10.A09;
                        r6.A01.add(0);
                        Collections.sort(r6.A01);
                        ((AbstractC16300pa) r6).A01.A00();
                        r6.A08();
                        r10.A00();
                    }
                    C52982cD r102 = r7.A0U;
                    if (((C03410Gc) r102).A03 == null) {
                        arrayList.add(new C48472Mj(r7.A0T.A06(R.string.emoji_recents_title), 1));
                        arrayList.add(new C48472Mj(3));
                    } else if (r102.A00() > 0) {
                        arrayList.add(new C48472Mj(r7.A0T.A06(R.string.emoji_recents_title), 1));
                        Iterator it = ((AbstractCollection) r102.A06(i)).iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            arrayList.add(new C48472Mj((AbstractC48432Mf) it.next(), 1, i3));
                            i3++;
                        }
                    } else {
                        C53342cv r9 = r7.A0A;
                        if (r9 != null && r9.A01) {
                            r9.A01 = false;
                            C53322ct r1 = r9.A09;
                            r1.A01.remove(0);
                            Collections.sort(r1.A01);
                            ((AbstractC16300pa) r1).A01.A00();
                            r1.A08();
                            r9.A00();
                        }
                    }
                }
                r7.A08(arrayList, new EnumC48532Mq[]{EnumC48532Mq.CONTENT_STICKERS, EnumC48532Mq.SHAPES});
                if (r7.A0D && r7.A0C.size() > 0) {
                    arrayList.add(new C48472Mj(r7.A0T.A06(R.string.shape_picker_favorite_stickers), 1));
                    C48522Mp.A02(arrayList, r7.A0C);
                } else if (!r7.A0D) {
                    arrayList.add(new C48472Mj(r7.A0T.A06(R.string.shape_picker_favorite_stickers), 1));
                    arrayList.add(new C48472Mj(3));
                }
            } else {
                arrayList = new ArrayList();
                if (!r7.A0l || r7.A08 == null) {
                    r7.A08(arrayList, new EnumC48532Mq[]{EnumC48532Mq.PEOPLE, EnumC48532Mq.NATURE, EnumC48532Mq.FOOD, EnumC48532Mq.ACTIVITY, EnumC48532Mq.SYMBOLS, EnumC48532Mq.OBJECTS});
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    EnumC03970Im[] values = EnumC03970Im.values();
                    int length = values.length;
                    int i4 = 0;
                    while (i4 < length) {
                        EnumC03970Im r62 = values[i4];
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        String A062 = r7.A0T.A06(r62.titleResId);
                        int i5 = z2 ? 1 : 0;
                        int i6 = z2 ? 1 : 0;
                        int i7 = z2 ? 1 : 0;
                        int i8 = z2 ? 1 : 0;
                        arrayList.add(new C48472Mj(A062, i5));
                        int i9 = 0;
                        for (int[] iArr : r62.emojiData) {
                            C52972cC r63 = new C52972cC(iArr, r7.A0b, r7.A0S);
                            arrayList.add(new C48472Mj(r63, 0, i9));
                            i9++;
                            r7.A0k.put(r63.A9J(), r63);
                        }
                        i4++;
                        z2 = true;
                    }
                    C53302cr r64 = r7.A08;
                    if (r64 != null) {
                        if (arrayList2.size() != C53302cr.A01.length) {
                            z2 = false;
                        }
                        AnonymousClass00E.A06(z2);
                        C53322ct r12 = r64.A09;
                        r12.A01 = arrayList2;
                        Collections.sort(arrayList2);
                        ((AbstractC16300pa) r12).A01.A00();
                        r12.A08();
                        r64.A00();
                    } else {
                        throw null;
                    }
                }
            }
        } else {
            arrayList = new ArrayList();
            r7.A0U.A00();
            EnumC48532Mq[] values2 = EnumC48532Mq.values();
            for (EnumC48532Mq r8 : values2) {
                if (z) {
                    arrayList.add(new C48472Mj(r7.A0T.A06(r8.sectionResId), 1));
                }
                AbstractC48432Mf[] r103 = r8.shapeData;
                int i10 = 0;
                for (AbstractC48432Mf r15 : r103) {
                    int A8W = r15.A8W(z);
                    int i11 = -1;
                    if (z) {
                        i11 = i10;
                    }
                    arrayList.add(new C48472Mj(r15, A8W, i11));
                    i10++;
                }
            }
        }
        this.A05 = arrayList;
        r4.A02(0, arrayList.size());
        if (size != this.A05.size()) {
            A0C();
        }
    }

    public final void A0B() {
        this.A01 = 0;
        for (List list : this.A04.values()) {
            if (list.size() > 1) {
                this.A01 = list.size() + this.A01;
            } else {
                return;
            }
        }
    }

    public final void A0C() {
        boolean z;
        C48522Mp r7 = this.A07;
        if (r7.A0A != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.A04.entrySet().iterator();
            int i = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (i >= this.A01 - 1) {
                    break;
                }
                arrayList.add(r7.A0g.get(entry.getKey()));
                arrayList2.add(Integer.valueOf(this.A05.size() + i));
                i += ((List) entry.getValue()).size();
            }
            C53342cv r3 = r7.A0A;
            if (r3 != null) {
                if (arrayList.size() != arrayList2.size()) {
                    z = false;
                }
                AnonymousClass00E.A06(z);
                List list = r3.A03;
                list.clear();
                list.addAll(arrayList);
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (r3.A01) {
                    arrayList3.add(0);
                }
                C53322ct r1 = r3.A09;
                r1.A01 = arrayList3;
                Collections.sort(arrayList3);
                ((AbstractC16300pa) r1).A01.A00();
                r1.A08();
                r3.A00();
                return;
            }
            throw null;
        }
    }

    public void A0D(String str) {
        List list = (List) this.A04.get(str);
        if (list != null) {
            int i = 0;
            for (Map.Entry entry : this.A04.entrySet()) {
                if (str.equals(entry.getKey())) {
                    this.A04.remove(str);
                    A0B();
                    int size = list.size();
                    super.A01.A03(this.A05.size() + i, size);
                    A0C();
                    return;
                }
                i += ((List) entry.getValue()).size();
            }
            throw new IllegalArgumentException(AnonymousClass008.A0L("Sticker pack id ", str, " is not contained in data set"));
        }
    }

    @Override // X.AnonymousClass2Q8
    public void AJi(AnonymousClass2Q9 r7) {
        if (r7.equals(this.A02)) {
            this.A05 = new ArrayList();
            List list = r7.A01;
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    AbstractC48432Mf r2 = (AbstractC48432Mf) list.get(i);
                    this.A07.A0k.put(r2.A9J(), r2);
                    this.A05.add(new C48472Mj((AbstractC48432Mf) list.get(i), 0, i));
                }
            } else {
                this.A05.add(new C48472Mj(this.A03, 2));
            }
            super.A01.A00();
        }
    }
}
