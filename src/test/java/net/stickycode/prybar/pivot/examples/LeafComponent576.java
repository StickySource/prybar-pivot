package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent576
    implements PrybarComponent {

  private RootComponent576 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent576.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent576.class, "root"));
  }

  public RootComponent576 getRoot() {
    return root;
  }

}
