package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent955
    implements PrybarComponent {

  private RootComponent955 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent955.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent955.class, "root"));
  }

  public RootComponent955 getRoot() {
    return root;
  }

}
