package X;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.28L  reason: invalid class name */
public class AnonymousClass28L extends AbstractC452223n implements View.OnClickListener {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public int A03 = 1;
    public int A04 = -1;
    public int A05 = -1;
    public int A06 = -1;
    public ColorStateList A07;
    public final int A08;
    public final SearchableInfo A09;
    public final Context A0A;
    public final SearchView A0B;
    public final WeakHashMap A0C;

    @Override // X.AbstractC30161ar
    public boolean hasStableIds() {
        return false;
    }

    public AnonymousClass28L(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.A0T);
        ((AbstractC30161ar) this).A01.getSystemService("search");
        this.A0B = searchView;
        this.A09 = searchableInfo;
        this.A08 = searchView.A0S;
        this.A0A = context;
        this.A0C = weakHashMap;
    }

    public static String A00(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    public final Drawable A04(String str) {
        Drawable newDrawable;
        Uri parse;
        InputStream openInputStream;
        int i;
        Drawable drawable;
        Drawable drawable2 = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                StringBuilder sb = new StringBuilder();
                sb.append("android.resource://");
                Context context = this.A0A;
                sb.append(context.getPackageName());
                sb.append("/");
                sb.append(parseInt);
                String obj = sb.toString();
                WeakHashMap weakHashMap = this.A0C;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(obj);
                if (constantState == null) {
                    drawable = null;
                } else {
                    drawable = constantState.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                Drawable A032 = C004302a.A03(context, parseInt);
                if (A032 != null) {
                    weakHashMap.put(obj, A032.getConstantState());
                }
                return A032;
            } catch (NumberFormatException unused) {
                WeakHashMap weakHashMap2 = this.A0C;
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap2.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                parse = Uri.parse(str);
                try {
                    if ("android.resource".equals(parse.getScheme())) {
                        try {
                            String authority = parse.getAuthority();
                            if (!TextUtils.isEmpty(authority)) {
                                try {
                                    Resources resourcesForApplication = ((AbstractC30161ar) this).A01.getPackageManager().getResourcesForApplication(authority);
                                    List<String> pathSegments = parse.getPathSegments();
                                    if (pathSegments != null) {
                                        int size = pathSegments.size();
                                        if (size == 1) {
                                            try {
                                                i = Integer.parseInt(pathSegments.get(0));
                                            } catch (NumberFormatException unused2) {
                                                throw new FileNotFoundException(AnonymousClass008.A0J("Single path segment is not a resource ID: ", parse));
                                            }
                                        } else if (size == 2) {
                                            i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                                        } else {
                                            throw new FileNotFoundException(AnonymousClass008.A0J("More than two path segments: ", parse));
                                        }
                                        if (i != 0) {
                                            drawable2 = resourcesForApplication.getDrawable(i);
                                        } else {
                                            throw new FileNotFoundException(AnonymousClass008.A0J("No resource found for: ", parse));
                                        }
                                    } else {
                                        throw new FileNotFoundException(AnonymousClass008.A0J("No path: ", parse));
                                    }
                                } catch (PackageManager.NameNotFoundException unused3) {
                                    throw new FileNotFoundException(AnonymousClass008.A0J("No package found for authority: ", parse));
                                }
                            } else {
                                throw new FileNotFoundException(AnonymousClass008.A0J("No authority: ", parse));
                            }
                        } catch (Resources.NotFoundException unused4) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Resource does not exist: ");
                            sb2.append(parse);
                            throw new FileNotFoundException(sb2.toString());
                        }
                    } else {
                        openInputStream = this.A0A.getContentResolver().openInputStream(parse);
                        if (openInputStream != null) {
                            Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                            try {
                                openInputStream.close();
                            } catch (IOException e) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Error closing icon stream for ");
                                sb3.append(parse);
                                Log.e("SuggestionsAdapter", sb3.toString(), e);
                            }
                            drawable2 = createFromStream;
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Failed to open ");
                            sb4.append(parse);
                            throw new FileNotFoundException(sb4.toString());
                        }
                    }
                } catch (FileNotFoundException e2) {
                    StringBuilder sb5 = new StringBuilder("Icon not found: ");
                    sb5.append(parse);
                    sb5.append(", ");
                    sb5.append(e2.getMessage());
                    Log.w("SuggestionsAdapter", sb5.toString());
                }
                if (drawable2 != null) {
                    weakHashMap2.put(str, drawable2.getConstantState());
                }
            } catch (Resources.NotFoundException unused5) {
                AnonymousClass008.A1B("Icon resource not found: ", str, "SuggestionsAdapter");
                return null;
            } catch (Throwable th) {
                try {
                    openInputStream.close();
                } catch (IOException e3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Error closing icon stream for ");
                    sb6.append(parse);
                    Log.e("SuggestionsAdapter", sb6.toString(), e3);
                }
                throw th;
            }
        }
        return drawable2;
    }

    @Override // X.AbstractC30161ar
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = ((AbstractC452223n) this).A02.inflate(((AbstractC452223n) this).A00, viewGroup, false);
            if (inflate != null) {
                ((C13520kN) inflate.getTag()).A03.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // X.AbstractC30161ar
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View A012 = A01(((AbstractC30161ar) this).A01, ((AbstractC30161ar) this).A02, viewGroup);
            ((C13520kN) A012.getTag()).A03.setText(e.toString());
            return A012;
        }
    }

    public void notifyDataSetChanged() {
        Bundle extras;
        super.notifyDataSetChanged();
        Cursor cursor = ((AbstractC30161ar) this).A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        Bundle extras;
        super.notifyDataSetInvalidated();
        Cursor cursor = ((AbstractC30161ar) this).A02;
        if (cursor != null && (extras = cursor.getExtras()) != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.A0B.A0D((CharSequence) tag);
        }
    }
}
