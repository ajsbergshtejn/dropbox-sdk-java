/* DO NOT EDIT */
/* This file was generated from sharing_files.stone */

package com.dropbox.core.v2.sharing;

import com.dropbox.core.DbxApiException;
import com.dropbox.core.LocalizedText;

/**
 * Exception thrown when the server responds with a {@link
 * ListFileMembersContinueError} error.
 */
public class ListFileMembersContinueErrorException extends DbxApiException {
    private static final long serialVersionUID = 0L;

    /**
     * The error reported by {@link
     * DbxUserSharingRequests#listFileMembersContinue(String)}.
     */
    public final ListFileMembersContinueError errorValue;

    public ListFileMembersContinueErrorException(String requestId, LocalizedText userMessage, ListFileMembersContinueError errorValue) {
        super(requestId, userMessage, buildMessage("list_file_members/continue", userMessage, errorValue));
        if (errorValue == null) {
            throw new NullPointerException("errorValue");
        }
        this.errorValue = errorValue;
    }
}
