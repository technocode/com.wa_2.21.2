package com.whatsapp.gallerypicker;

import X.ActivityC004602e;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass08D;
import X.AnonymousClass0LW;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.AnonymousClass2UT;
import X.C002001d;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.MenuItem$OnMenuItemClickListenerC48982On;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.Window;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GalleryPicker extends ActivityC004602e {
    public int A00 = 7;
    public final AnonymousClass08D A01 = AnonymousClass08D.A00();
    public final AnonymousClass01A A02 = AnonymousClass01A.A00();
    public final C014308b A03 = C014308b.A00();
    public final AnonymousClass03S A04 = AnonymousClass03S.A00();

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 0) {
            if (i != 1) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 != -1) {
            } else {
                if (getIntent().getBooleanExtra("preview", true)) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                    if (parcelableArrayListExtra == null) {
                        Uri data = intent.getData();
                        if (data != null) {
                            parcelableArrayListExtra = new ArrayList();
                            parcelableArrayListExtra.add(data);
                        } else {
                            return;
                        }
                    }
                    String stringExtra = getIntent().getStringExtra("jid");
                    long longExtra = getIntent().getLongExtra("picker_open_time", 0);
                    long longExtra2 = getIntent().getLongExtra("quoted_message_row_id", 0);
                    String stringExtra2 = getIntent().getStringExtra("quoted_group_jid");
                    boolean booleanExtra = getIntent().getBooleanExtra("number_from_url", false);
                    Intent intent2 = new Intent(this, MediaPreviewActivity.class);
                    intent2.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                    intent2.putExtra("android.intent.extra.TEXT", (String) null);
                    intent2.putExtra("jid", stringExtra);
                    intent2.putExtra("jids", (Serializable) null);
                    intent2.putExtra("max_items", 0);
                    intent2.putExtra("origin", 1);
                    intent2.putExtra("picker_open_time", longExtra);
                    intent2.putExtra("send", true);
                    intent2.putExtra("quoted_message_row_id", longExtra2);
                    intent2.putExtra("quoted_group_jid", stringExtra2);
                    intent2.putExtra("number_from_url", booleanExtra);
                    intent2.putExtra("media_preview_params", (Bundle) null);
                    intent2.putExtra("smb_quick_reply", false);
                    intent2.putExtra("start_home", false);
                    intent2.putExtra("animate_uri", (Parcelable) null);
                    intent2.putExtra("preselected_image_uri", (Parcelable) null);
                    intent2.putExtra("scan_for_qr", false);
                    startActivityForResult(intent2, 0);
                    return;
                }
                setResult(-1, intent);
                finish();
            }
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        } else if (i2 == 2) {
            setResult(2);
            finish();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        String A0D;
        A0A().A0H(5);
        if (AnonymousClass2UT.A00) {
            Window window = getWindow();
            window.requestFeature(13);
            window.requestFeature(12);
            Transition inflateTransition = TransitionInflater.from(this).inflateTransition(17760258);
            inflateTransition.excludeTarget(16908335, true);
            inflateTransition.excludeTarget(16908336, true);
            window.setExitTransition(inflateTransition);
            Transition inflateTransition2 = TransitionInflater.from(this).inflateTransition(17760259);
            inflateTransition2.excludeTarget(16908335, true);
            inflateTransition2.excludeTarget(16908336, true);
            window.setReenterTransition(inflateTransition2);
        }
        super.onCreate(bundle);
        RequestPermissionActivity.A0N(this, this.A04);
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        setTitle(r6.A06(R.string.gallery_picker_label));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            AnonymousClass02N A012 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
            if (A012 != null) {
                C007003k A0A = this.A02.A0A(A012);
                if (A0A.A09()) {
                    A0D = r6.A0D(R.string.sent_to_group, this.A03.A08(A0A, false));
                } else {
                    A0D = r6.A0D(R.string.sent_to_person, this.A03.A08(A0A, false));
                }
                A0L(A0D);
            }
            this.A00 = getIntent().getIntExtra("include_media", 7);
            setContentView(R.layout.gallery_picker);
            if (bundle == null) {
                GalleryPickerFragment galleryPickerFragment = new GalleryPickerFragment();
                Bundle bundle2 = new Bundle();
                int i = this.A00;
                if (i == 7) {
                    bundle2.putInt("include", 7);
                } else if (i == 1) {
                    bundle2.putInt("include", 1);
                } else if (i == 4) {
                    bundle2.putInt("include", 4);
                } else if (i == 2) {
                    bundle2.putInt("include", 2);
                }
                galleryPickerFragment.A0N(bundle2);
                AnonymousClass0LW A042 = A04();
                if (A042 != null) {
                    AnonymousClass0QB r1 = new AnonymousClass0QB(A042);
                    r1.A05(R.id.gallery_picker_layout, galleryPickerFragment);
                    r1.A00();
                } else {
                    throw null;
                }
            }
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("android.intent.extra.STREAM");
            Uri uri = (Uri) getIntent().getParcelableExtra("bucket_uri");
            if (uri != null) {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.putExtra("include_media", this.A00);
                intent.putExtra("preview", getIntent().getBooleanExtra("preview", true));
                intent.putExtra("quoted_message_row_id", getIntent().getLongExtra("quoted_message_row_id", 0));
                intent.putExtra("quoted_group_jid", getIntent().getStringExtra("quoted_group_jid"));
                intent.putExtra("jid", getIntent().getStringExtra("jid"));
                intent.putExtra("max_items", getIntent().getIntExtra("max_items", Integer.MAX_VALUE));
                intent.putExtra("is_in_multi_select_mode_only", getIntent().getBooleanExtra("is_in_multi_select_mode_only", false));
                intent.putExtra("android.intent.extra.STREAM", parcelableArrayListExtra);
                intent.putExtra("picker_open_time", getIntent().getLongExtra("picker_open_time", 0));
                intent.setClass(this, MediaPicker.class);
                startActivityForResult(intent, 0);
                return;
            }
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        Intent intent;
        int i = this.A00;
        if (i == 4) {
            intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
            intent.setType("video/*");
        } else if (i == 2) {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/gif");
        } else {
            intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.INTERNAL_CONTENT_URI);
            intent.setType("image/*");
        }
        PackageManager packageManager = getPackageManager();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        if (size <= 0) {
            return true;
        }
        getMenuInflater().inflate(R.menu.gallery_picker, menu);
        SubMenu subMenu = menu.findItem(R.id.more).getSubMenu();
        subMenu.clear();
        subMenu.setIcon(C002001d.A0b(this, R.drawable.ic_more_teal, R.color.tealActionBarItemDrawableTint));
        menu.findItem(R.id.default_item).setVisible(false);
        Drawable A032 = C004302a.A03(this, R.mipmap.icon);
        if (A032 != null) {
            ArrayList arrayList = new ArrayList(size);
            int i2 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            int intrinsicHeight = A032.getIntrinsicHeight();
            int i3 = 0;
            do {
                Drawable loadIcon = queryIntentActivities.get(i3).loadIcon(packageManager);
                i2 = Math.max(loadIcon.getIntrinsicHeight(), i2);
                arrayList.add(loadIcon);
                i3++;
            } while (i3 < size);
            int min = Math.min(intrinsicHeight, i2);
            int i4 = 0;
            do {
                ResolveInfo resolveInfo = queryIntentActivities.get(i4);
                Drawable drawable = (Drawable) arrayList.get(i4);
                if (drawable instanceof BitmapDrawable) {
                    drawable = new BitmapDrawable(getResources(), Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), min, min, false));
                }
                MenuItem add = subMenu.add(resolveInfo.loadLabel(packageManager));
                add.setIcon(drawable);
                add.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC48982On(this, intent, resolveInfo));
                i4++;
            } while (i4 < size);
            return true;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A01.A03().A00.A06(-1);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
