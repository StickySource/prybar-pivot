package net.stickycode.prybar.pivot.examples;

import net.stickycode.prybar.pivot.PrybarComponent;
import net.stickycode.prybar.pivot.PrybarComponentLookup;
import net.stickycode.prybar.pivot.PrybarRuntime;

public class LeafComponent805
    implements PrybarComponent {

  private RootComponent805 root;

  @Override
  public void wire(PrybarRuntime r) {
    this.root = r.find(RootComponent805.class);
    if (root == null)
      r.failure(new PrybarComponentLookup(this, RootComponent805.class, "root"));
  }

  public RootComponent805 getRoot() {
    return root;
  }

}
