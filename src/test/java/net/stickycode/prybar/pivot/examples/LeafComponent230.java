package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent230
    implements PrybarComponent {

  private RootComponent230 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent230.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent230.class, "root"));
  }

  public RootComponent230 getRoot() {
    return root;
  }

}
