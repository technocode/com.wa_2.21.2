package com.whatsapp.util;

import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004802g;
import X.AnonymousClass008;
import X.AnonymousClass02N;
import X.AnonymousClass02R;
import X.AnonymousClass02U;
import X.AnonymousClass0M3;
import X.AnonymousClass0Q7;
import X.AnonymousClass0TX;
import X.AnonymousClass1S6;
import X.AnonymousClass2IF;
import X.AnonymousClass2UT;
import X.AnonymousClass3OV;
import X.AnonymousClass3OY;
import X.C002001d;
import X.C14460mJ;
import X.C42231wM;
import X.C42291wT;
import X.C48052Ks;
import X.C51682Zr;
import X.C60372pK;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.biz.catalog.CatalogImageListActivity;
import com.whatsapp.biz.catalog.CatalogMediaView;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper;
import com.whatsapp.settings.chat.wallpaper.WallpaperCategoriesActivity;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;
import java.util.ArrayList;

public class ViewOnClickCListenerShape2S0101000_I1 extends AbstractView$OnClickListenerC08330av {
    public int A00;
    public Object A01;
    public final int A02;

    public ViewOnClickCListenerShape2S0101000_I1(AnonymousClass2IF r2, int i) {
        this.A02 = 3;
        this.A01 = r2;
        this.A00 = i;
    }

    public ViewOnClickCListenerShape2S0101000_I1(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        Intent intent;
        switch (this.A02) {
            case 0:
                C42231wM r2 = (C42231wM) this.A01;
                if (r2.A01.getTag(R.id.loaded_image_url) != null) {
                    ThumbnailButton thumbnailButton = r2.A01;
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView = r2.A02;
                    String str = catalogCarouselDetailImageView.A04.A06;
                    int i = this.A00;
                    thumbnailButton.setTag(AnonymousClass1S6.A01(str, i));
                    CatalogMediaView.A04(catalogCarouselDetailImageView.getContext(), catalogCarouselDetailImageView.A04, catalogCarouselDetailImageView.A08, i, r2.A01, catalogCarouselDetailImageView.A05);
                    catalogCarouselDetailImageView.A09.A02(6, 25, catalogCarouselDetailImageView.A04.A06, catalogCarouselDetailImageView.A05);
                    return;
                }
                return;
            case 1:
                C42231wM r22 = (C42231wM) this.A01;
                if (r22.A01.getTag(R.id.loaded_image_url) != null) {
                    CatalogCarouselDetailImageView catalogCarouselDetailImageView2 = r22.A02;
                    C48052Ks r8 = catalogCarouselDetailImageView2.A04;
                    ThumbnailButton thumbnailButton2 = r22.A01;
                    int i2 = this.A00;
                    Context context = catalogCarouselDetailImageView2.getContext();
                    UserJid userJid = catalogCarouselDetailImageView2.A05;
                    Context A0O = C002001d.A0O(context);
                    if (A0O instanceof ActivityC004802g) {
                        Activity activity = (Activity) A0O;
                        Intent intent2 = new Intent(A0O, CatalogImageListActivity.class);
                        intent2.putExtra("product", r8);
                        intent2.putExtra("image_index", i2);
                        intent2.putExtra("cached_jid", userJid.getRawString());
                        AnonymousClass0Q7.A0g(thumbnailButton2, AnonymousClass008.A0K("thumb-transition-", AnonymousClass1S6.A01(r8.A06, i2)));
                        activity.startActivity(intent2, AnonymousClass2UT.A01(activity, thumbnailButton2, AnonymousClass0Q7.A0G(thumbnailButton2)));
                    }
                    catalogCarouselDetailImageView2.A09.A02(6, 25, catalogCarouselDetailImageView2.A04.A06, catalogCarouselDetailImageView2.A05);
                    return;
                }
                return;
            case 2:
                Context context2 = view.getContext();
                C42291wT r0 = (C42291wT) this.A01;
                CatalogImageListActivity catalogImageListActivity = r0.A03;
                CatalogMediaView.A04(context2, catalogImageListActivity.A06, r0.A02, this.A00, view, catalogImageListActivity.A07);
                catalogImageListActivity.A09.A02(9, 28, catalogImageListActivity.A06.A06, catalogImageListActivity.A07);
                return;
            case 3:
                AnonymousClass2IF r10 = (AnonymousClass2IF) this.A01;
                C60372pK r82 = r10.A03;
                Intent A0k = r82.A0k();
                ActivityC004802g r4 = (ActivityC004802g) r82.getContext();
                Bundle bundle = null;
                if (AnonymousClass2UT.A00) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = this.A00;
                    if (i3 < 3 || r82.A04.size() == 4) {
                        A0k.putExtra("start_index", i3);
                        r10.A00(arrayList, (AnonymousClass0M3) r82.A04.get(i3));
                    } else {
                        int i4 = 0;
                        do {
                            ((AnonymousClass2IF) r82.A0I.get(i4)).A00(arrayList, (AnonymousClass0M3) r82.A04.get(i4));
                            i4++;
                        } while (i4 < 3);
                    }
                    Bundle A012 = C14460mJ.A00(r4, (AnonymousClass02R[]) arrayList.toArray(new AnonymousClass02R[0])).A01();
                    C51682Zr r02 = new C51682Zr(r4);
                    if (r4 != null) {
                        AnonymousClass0TX.A0G(r4, r02);
                        bundle = A012;
                    } else {
                        throw null;
                    }
                }
                r4.startActivity(A0k, bundle);
                return;
            case 4:
                GroupChatInfo groupChatInfo = (GroupChatInfo) this.A01;
                AnonymousClass02U r23 = groupChatInfo.A0S;
                if (r23 != null) {
                    groupChatInfo.APl(ChatInfoActivity.EncryptionExplanationDialogFragment.A00(r23, this.A00, null), null);
                    return;
                }
                throw null;
            case 5:
                AnonymousClass3OY r03 = (AnonymousClass3OY) this.A01;
                AnonymousClass3OV r24 = r03.A0A;
                int intValue = ((Number) r03.A0E.get(this.A00)).intValue();
                WallpaperCategoriesActivity wallpaperCategoriesActivity = r24.A00;
                boolean z = r24.A01;
                boolean z2 = true;
                if (intValue == 0 || intValue == 1) {
                    AnonymousClass02N r25 = wallpaperCategoriesActivity.A03;
                    if (intValue != 0) {
                        z2 = false;
                    }
                    intent = new Intent(wallpaperCategoriesActivity, DownloadableWallpaperPickerActivity.class);
                    intent.putExtra("chat_jid", r25);
                    intent.putExtra("is_using_global_wallpaper", z);
                    intent.putExtra("IS_BRIGHT_KEY", z2);
                } else if (intValue == 2) {
                    AnonymousClass02N r26 = wallpaperCategoriesActivity.A03;
                    intent = new Intent(wallpaperCategoriesActivity, SolidColorWallpaper.class);
                    intent.putExtra("chat_jid", r26);
                    intent.putExtra("is_using_global_wallpaper", z);
                } else if (intValue == 3) {
                    AnonymousClass02N r27 = wallpaperCategoriesActivity.A03;
                    intent = new Intent(wallpaperCategoriesActivity, GalleryPickerLauncher.class);
                    intent.putExtra("chat_jid", r27);
                    intent.putExtra("is_using_global_wallpaper", z);
                } else if (intValue == 4) {
                    Bundle A013 = AnonymousClass008.A01("dialog_id", 112);
                    A013.putString("message", wallpaperCategoriesActivity.getString(R.string.wallpaper_remove_custom_wallpaper_dialog_title));
                    A013.putString("positive_button", wallpaperCategoriesActivity.getString(R.string.wallpaper_remove_custom_wallpaper_dialog_remove_prompt));
                    A013.putString("negative_button", wallpaperCategoriesActivity.getString(R.string.cancel));
                    PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                    promptDialogFragment.A0N(A013);
                    wallpaperCategoriesActivity.APm(promptDialogFragment);
                    return;
                } else if (intValue == 5) {
                    AnonymousClass02N r28 = wallpaperCategoriesActivity.A03;
                    intent = new Intent(wallpaperCategoriesActivity, DefaultWallpaperPreview.class);
                    intent.putExtra("chat_jid", r28);
                    intent.putExtra("is_using_global_wallpaper", z);
                } else {
                    return;
                }
                wallpaperCategoriesActivity.startActivityForResult(intent, 17);
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
