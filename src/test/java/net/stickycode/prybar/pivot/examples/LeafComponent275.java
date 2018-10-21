package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent275
    implements PrybarComponent {

  private RootComponent275 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent275.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent275.class, "root"));
  }

  public RootComponent275 getRoot() {
    return root;
  }

}
