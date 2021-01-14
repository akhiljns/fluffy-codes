          the solution is based on backtracking algorithm which solves the probel in O(n^n) time complexity

          we are essentially creating subtrees of every solution we might find



          for example                                                    root node
                                                 2                           3                            4
                                            2    3     4              2      3       4              2      3      4
                                           2,3,4 ..................... 
                                           
                                           we create these subtrees and we keep dividing our N(required value) with the values when we traverse the subtrees
                                           
                                           
                                           
                                           case - N = 12
                                           subtree 1 - 12/2 = 6, 6/2 = 3, 3/2 != 1 hence we move to different node i.e. 3/3 = 1
                                           so solution is traversed elements - 2,2,3,1
                                           
                                           similarly we keep finding the solution untill we have shorted possible traversal length 
                                           
                                           
                                           
                                          ** we are also sorting the elements in the end as we need the lexographic solution **
