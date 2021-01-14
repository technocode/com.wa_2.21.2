package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class InputConnectionCompat {
    public static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ClipDescription description = inputContentInfoCompat.mImpl.getDescription();
        boolean z = false;
        for (String str7 : EditorInfoCompat.getContentMimeTypes(editorInfo)) {
            if (description.hasMimeType(str7)) {
                if (Build.VERSION.SDK_INT >= 25) {
                    return inputConnection.commitContent((InputContentInfo) inputContentInfoCompat.mImpl.getInputContentInfo(), i, bundle);
                } else {
                    int protocol = EditorInfoCompat.getProtocol(editorInfo);
                    if (protocol == 2) {
                        z = true;
                    } else if (!(protocol == 3 || protocol == 4)) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    if (z) {
                        str = COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY;
                    } else {
                        str = COMMIT_CONTENT_CONTENT_URI_KEY;
                    }
                    bundle2.putParcelable(str, inputContentInfoCompat.mImpl.getContentUri());
                    if (z) {
                        str2 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
                    } else {
                        str2 = COMMIT_CONTENT_DESCRIPTION_KEY;
                    }
                    bundle2.putParcelable(str2, inputContentInfoCompat.mImpl.getDescription());
                    if (z) {
                        str3 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
                    } else {
                        str3 = COMMIT_CONTENT_LINK_URI_KEY;
                    }
                    bundle2.putParcelable(str3, inputContentInfoCompat.mImpl.getLinkUri());
                    if (z) {
                        str4 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
                    } else {
                        str4 = COMMIT_CONTENT_FLAGS_KEY;
                    }
                    bundle2.putInt(str4, i);
                    if (z) {
                        str5 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
                    } else {
                        str5 = COMMIT_CONTENT_OPTS_KEY;
                    }
                    bundle2.putParcelable(str5, bundle);
                    if (z) {
                        str6 = COMMIT_CONTENT_INTEROP_ACTION;
                    } else {
                        str6 = COMMIT_CONTENT_ACTION;
                    }
                    return inputConnection.performPrivateCommand(str6, bundle2);
                }
            }
        }
        return false;
    }

    public static InputConnection createWrapper(InputConnection inputConnection, EditorInfo editorInfo, final OnCommitContentListener onCommitContentListener) {
        if (inputConnection == null) {
            throw new IllegalArgumentException("inputConnection must be non-null");
        } else if (editorInfo == null) {
            throw new IllegalArgumentException("editorInfo must be non-null");
        } else if (onCommitContentListener == null) {
            throw new IllegalArgumentException("onCommitContentListener must be non-null");
        } else if (Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection, false) {
                /* class androidx.core.view.inputmethod.InputConnectionCompat.AnonymousClass1 */

                public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                    if (onCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i, bundle);
                }
            };
        } else {
            if (EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0) {
                return inputConnection;
            }
            return new InputConnectionWrapper(inputConnection, false) {
                /* class androidx.core.view.inputmethod.InputConnectionCompat.AnonymousClass2 */

                public boolean performPrivateCommand(String str, Bundle bundle) {
                    if (InputConnectionCompat.handlePerformPrivateCommand(str, bundle, onCommitContentListener)) {
                        return true;
                    }
                    return super.performPrivateCommand(str, bundle);
                }
            };
        }
    }

    public static boolean handlePerformPrivateCommand(String str, Bundle bundle, OnCommitContentListener onCommitContentListener) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z2 = false;
        z2 = false;
        if (bundle == null) {
            return z2;
        }
        if (TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
            z = false;
        } else if (!TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
            return z2;
        } else {
            z = true;
        }
        ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable(z ? COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY : COMMIT_CONTENT_RESULT_RECEIVER_KEY);
        try {
            Uri uri = (Uri) bundle.getParcelable(z ? COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY : COMMIT_CONTENT_CONTENT_URI_KEY);
            if (z) {
                str2 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
            } else {
                str2 = COMMIT_CONTENT_DESCRIPTION_KEY;
            }
            ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str2);
            if (z) {
                str3 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
            } else {
                str3 = COMMIT_CONTENT_LINK_URI_KEY;
            }
            Uri uri2 = (Uri) bundle.getParcelable(str3);
            if (z) {
                str4 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
            } else {
                str4 = COMMIT_CONTENT_FLAGS_KEY;
            }
            int i = bundle.getInt(str4);
            if (z) {
                str5 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
            } else {
                str5 = COMMIT_CONTENT_OPTS_KEY;
            }
            Bundle bundle2 = (Bundle) bundle.getParcelable(str5);
            if (!(uri == null || clipDescription == null)) {
                z2 = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
            }
            return z2;
        } finally {
            if (resultReceiver != null) {
                resultReceiver.send(z2 ? 1 : 0, null);
                throw th;
            }
        }
    }
}
