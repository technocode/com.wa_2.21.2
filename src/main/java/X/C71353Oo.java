package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Oo  reason: invalid class name and case insensitive filesystem */
public class C71353Oo extends AbstractC16300pa {
    public final Resources A00;
    public final C002701k A01;
    public final C71373Oq A02;
    public final AnonymousClass00T A03;
    public final List A04 = new ArrayList();
    public final Map A05 = new HashMap();

    public C71353Oo(C002701k r2, AnonymousClass00T r3, Resources resources, C71373Oq r5) {
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = resources;
        this.A02 = r5;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A04.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 0 || i == 1) {
            C002701k r4 = this.A01;
            AnonymousClass00T r2 = this.A03;
            C74043Zz r1 = new C74043Zz(context);
            r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C74073a3 r3 = new C74073a3(r1, r4, r2);
            r3.A0H.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r3, 33));
            return r3;
        }
        LayoutInflater from = LayoutInflater.from(context);
        if (i == 3) {
            return new C74053a1(from.inflate(R.layout.downloadable_wallpaper_footer_view, (ViewGroup) null));
        }
        C74063a2 r32 = new C74063a2(from.inflate(R.layout.downloadable_wallpaper_header_view, (ViewGroup) null));
        r32.A0H.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 36));
        return r32;
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r7, int i) {
        AbstractC71293Oi r72 = (AbstractC71293Oi) r7;
        List list = this.A04;
        int i2 = ((AbstractC658031p) list.get(i)).A00;
        int i3 = 0;
        if (i2 == 0) {
            File file = (File) ((AbstractC658031p) list.get(i)).A01;
            C74073a3 r73 = (C74073a3) r72;
            C09840dc r0 = r73.A00;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            C09840dc r2 = new C09840dc(r73.A01, r73.A0H.getContext(), r73.A02, file);
            r73.A00 = r2;
            r73.A03.ANC(r2, new Void[0]);
            this.A05.put(Integer.valueOf(i), r73.A00);
        } else if (i2 == 1) {
            C74073a3 r74 = (C74073a3) r72;
            int intValue = ((Number) ((AbstractC658031p) list.get(i)).A01).intValue();
            Resources resources = this.A00;
            if (resources != null) {
                Drawable drawable = resources.getDrawable(intValue);
                C09840dc r02 = r74.A00;
                if (r02 != null) {
                    ((AnonymousClass0JW) r02).A00.cancel(true);
                    r74.A00 = null;
                }
                r74.A02.setImageDrawable(drawable);
                return;
            }
            throw null;
        } else if (i2 == 2) {
            C74063a2 r75 = (C74063a2) r72;
            if (!((Boolean) ((AbstractC658031p) list.get(i)).A01).booleanValue()) {
                i3 = 4;
            }
            r75.A00.setVisibility(i3);
            r75.A01.setVisibility(i3);
        }
    }

    public void A08(List list, AnonymousClass02R r6, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C71323Ol((File) it.next()));
        }
        if (i != 0) {
            if (i == 1) {
                arrayList.add(new C71343On(Boolean.TRUE));
                arrayList.add(new C71333Om());
            } else {
                arrayList.add(new C71343On(Boolean.FALSE));
                Object obj = r6.A00;
                if (obj != null) {
                    for (Integer num : (List) obj) {
                        arrayList.add(new C71313Ok(num));
                    }
                } else {
                    throw null;
                }
            }
        }
        List list2 = this.A04;
        C16040p9 A002 = AnonymousClass0pD.A00(new C71303Oj(list2, arrayList));
        list2.clear();
        list2.addAll(arrayList);
        A002.A02(new C30401bI(this));
    }
}
