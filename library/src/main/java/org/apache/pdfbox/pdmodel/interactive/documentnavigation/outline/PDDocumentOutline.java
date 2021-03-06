package org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline;

import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSName;

/**
 * This represents an outline in a pdf document.
 *
 * @author <a href="mailto:ben@benlitchfield.com">Ben Litchfield</a>
 * @version $Revision: 1.2 $
 */
public final class PDDocumentOutline extends PDOutlineNode
{

    /**
     * Default Constructor.
     */
    public PDDocumentOutline()
    {
    	getCOSDictionary().setName(COSName.TYPE, COSName.OUTLINES.getName());
    }

    /**
     * Constructor for an existing document outline.
     *
     * @param dic The storage dictionary.
     */
    public PDDocumentOutline( COSDictionary dic )
    {
    	super( dic );
    	getCOSDictionary().setName(COSName.TYPE, COSName.OUTLINES.getName());
    }

    @Override
    public boolean isNodeOpen()
    {
    	return true;
    }

    @Override
    public void openNode()
    {
    	// The root of the outline hierarchy is not an OutlineItem and cannot be opened or closed
    }

    @Override
    public void closeNode()
    {
    	// The root of the outline hierarchy is not an OutlineItem and cannot be opened or closed
    }
}
