package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent555
    implements PrybarComponent {

  private RootComponent555 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent555.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent555.class, "root"));
  }

  public RootComponent555 getRoot() {
    return root;
  }

}
