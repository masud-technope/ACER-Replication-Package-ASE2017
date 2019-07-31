package org.apache.sling.hapi.client;

import org.apache.http.NameValuePair;
import java.util.List;
import java.util.Set;

/**
 *
 */
public interface Item {

    /**
     * Returns the property of the item having the given name.
     */
    Items prop(String name) throws ClientException;

    /**
     * Return a List of all the properties of this item
     */
    Set<String> props() throws ClientException;

    /**
     * Returns the child links that have the given relation
     */
    Items link(String rel) throws ClientException;

    /**
     * Returns the child forms that have the given relation
     */
    Items form(String rel) throws ClientException;

    /**
     * Returns the text value of the property.
     */
    String text() throws ClientException;

    /**
     * Returns he boolean value of the property
     */
    boolean bool() throws ClientException;

    int number() throws ClientException;

    /**
     * Returns the href value of the property. This only makes sense for hyperlinks (&lt;a&gt; or &lt;link&gt;).
     */
    String href();

    /**
     * Returns the <i>src</i> value of the property.
     */
    String src();

    /**
     * Follow a hyperlink and get a new {@see Document} representation
     */
    Document follow() throws ClientException;

    /**
     * Submits this form item and returns a new {@see Document} representation
     */
    Document submit(Iterable<NameValuePair> data) throws ClientException;
}
