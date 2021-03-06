package maspack.test.GL;

import maspack.geometry.PolygonalMesh;

public class MultiGL2Tester extends MultiViewerTesterBase {

   protected static void addRenderObjects(MultiViewer tester) {

      addCube(tester);
      addAxes(tester);
      addTransRotator(tester);
      addCylinder(tester);

      PolygonalMesh bunny = loadStanfordBunny();
      addStanfordBunnies(tester, bunny);
      addSolidBunny(tester, bunny);
      addHalfBunny(tester, bunny);

   }

   public static void main(String[] args) {

      MultiViewer rot = new MultiViewer();
      rot.addGL2Viewer("GL2 Viewer 1", 30, 30, 640, 480);
      rot.addGL2Viewer("GL2 Viewer 2", 670, 30, 640, 480);
      rot.syncViews();

      addRenderObjects(rot);

      // adjust all windows to a specific size
      rot.setWindowSizes(640, 480);
      rot.autoFitViewers();

   }

}
