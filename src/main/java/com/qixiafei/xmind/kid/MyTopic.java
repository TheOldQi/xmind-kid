package com.qixiafei.xmind.kid;

import org.xmind.core.*;
import org.xmind.core.marker.IMarkerRef;
import org.xmind.core.util.Point;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * <P>Description: 重写ITopic部分方法，作为虚拟节点. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:    </P>
 * <P>CREATE DATE: 2019/4/30 23:33</P>
 * <P>UPDATE DATE: </P>
 *
 * @author qixiafei
 * @version 1.0
 * @since java 1.8.0
 */
public class MyTopic implements ITopic {

    private List<ITopic> childrens;
    private String titleText;

    public MyTopic(final String titleText, final List<ITopic> childrens) {
        this.titleText = titleText;
        this.childrens = childrens;
    }

    @Override
    public List<ITopic> getAllChildren() {
        return childrens;
    }

    @Override
    public String getTitleText() {
        return titleText;
    }

    @Override
    public boolean isFolded() {
        return false;
    }

    @Override
    public void setFolded(boolean b) {

    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public boolean isAttached() {
        return false;
    }

    @Override
    public Iterator<ITopic> getAllChildrenIterator() {
        return null;
    }

    @Override
    public List<ITopic> getChildren(String s) {
        return null;
    }

    @Override
    public Iterator<ITopic> getChildrenIterator(String s) {
        return null;
    }

    @Override
    public boolean hasChildren(String s) {
        return false;
    }

    @Override
    public Set<String> getChildrenTypes() {
        return null;
    }

    @Override
    public void add(ITopic iTopic) {

    }

    @Override
    public void add(ITopic iTopic, String s) {

    }

    @Override
    public void add(ITopic iTopic, int i, String s) {

    }

    @Override
    public void remove(ITopic iTopic) {

    }

    @Override
    public ITopicPath getPath() {
        return null;
    }

    @Override
    public int getIndex() {
        return 0;
    }

    @Override
    public void setHyperlink(String s) {

    }

    @Override
    public String getHyperlink() {
        return null;
    }

    @Override
    public INotes getNotes() {
        return null;
    }

    @Override
    public INumbering getNumbering() {
        return null;
    }

    @Override
    public boolean isRoot() {
        return false;
    }

    @Override
    public void addMarker(String s) {

    }

    @Override
    public void removeMarker(String s) {

    }

    @Override
    public boolean hasMarker(String s) {
        return false;
    }

    @Override
    public Set<IMarkerRef> getMarkerRefs() {
        return null;
    }

    @Override
    public void addBoundary(IBoundary iBoundary) {

    }

    @Override
    public void removeBoundary(IBoundary iBoundary) {

    }

    @Override
    public Set<IBoundary> getBoundaries() {
        return null;
    }

    @Override
    public void addSummary(ISummary iSummary) {

    }

    @Override
    public void removeSummary(ISummary iSummary) {

    }

    @Override
    public Set<ISummary> getSummaries() {
        return null;
    }

    @Override
    public String getStructureClass() {
        return null;
    }

    @Override
    public void setStructureClass(String s) {

    }

    @Override
    public IImage getImage() {
        return null;
    }

    @Override
    public int getTitleWidth() {
        return 0;
    }

    @Override
    public void setTitleWidth(int i) {

    }

    @Override
    public List<ITopicExtension> getExtensions() {
        return null;
    }

    @Override
    public ITopicExtension getExtension(String s) {
        return null;
    }

    @Override
    public ITopicExtension createExtension(String s) {
        return null;
    }

    @Override
    public void deleteExtension(String s) {

    }

    @Override
    public long getModifiedTime() {
        return 0;
    }

    @Override
    public String getModifiedBy() {
        return null;
    }

    @Override
    public void setZClass(String s) {

    }

    @Override
    public String getZClass() {
        return null;
    }

    @Override
    public <T> T getAdapter(Class<T> aClass) {
        return null;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public Set<String> getLabels() {
        return null;
    }

    @Override
    public void setLabels(Collection<String> collection) {

    }

    @Override
    public void addLabel(String s) {

    }

    @Override
    public void removeLabel(String s) {

    }

    @Override
    public void removeAllLabels() {

    }

    @Override
    public void setPosition(int i, int i1) {

    }

    @Override
    public Point getPosition() {
        return null;
    }

    @Override
    public void setPosition(Point point) {

    }

    @Override
    public boolean hasPosition() {
        return false;
    }

    @Override
    public ISheet getOwnedSheet() {
        return null;
    }

    @Override
    public void setTitleText(String s) {

    }


    @Override
    public boolean hasTitle() {
        return false;
    }

    @Override
    public ITopic getParent() {
        return null;
    }

    @Override
    public IWorkbook getOwnedWorkbook() {
        return null;
    }

    @Override
    public boolean isOrphan() {
        return false;
    }

    @Override
    public String getStyleId() {
        return null;
    }

    @Override
    public void setStyleId(String s) {

    }

    @Override
    public String getStyleType() {
        return null;
    }
}
