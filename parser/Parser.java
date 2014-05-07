/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import lexer.*;
import node.*;
import analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList<Object> nodeList;

    private final Lexer lexer;
    private final ListIterator<Object> stack = new LinkedList<Object>().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList<Object> listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            // int middle = (low + high) / 2;
            int middle = (low + high) >>> 1;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList<Object> pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList<Object> list = new ArrayList<Object>();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    {
                        int reduction = this.action[1];
                        if(reduction < 500) reduce_0(reduction);
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PVar node1 = (PVar) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }

    private void reduce_0(int reduction) throws IOException, LexerException, ParserException
    {
        switch(reduction)
        {
            case 0: /* reduce AIdVar */
            {
                ArrayList<Object> list = new0();
                push(goTo(0), list, false);
            }
            break;
            case 1: /* reduce AMatrizVar */
            {
                ArrayList<Object> list = new1();
                push(goTo(0), list, false);
            }
            break;
            case 2: /* reduce AStringValor */
            {
                ArrayList<Object> list = new2();
                push(goTo(1), list, false);
            }
            break;
            case 3: /* reduce AInteiroValor */
            {
                ArrayList<Object> list = new3();
                push(goTo(1), list, false);
            }
            break;
            case 4: /* reduce ARealValor */
            {
                ArrayList<Object> list = new4();
                push(goTo(1), list, false);
            }
            break;
        }
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new0() /* reduce AIdVar */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PVar pvarNode1;
        {
            // Block
        TId tidNode2;
        tidNode2 = (TId)nodeArrayList1.get(0);

        pvarNode1 = new AIdVar(tidNode2);
        }
	nodeList.add(pvarNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new1() /* reduce AMatrizVar */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList4 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PVar pvarNode1;
        {
            // Block
        TId tidNode2;
        TLCol tlcolNode3;
        TNInt tnintNode4;
        TRCol trcolNode5;
        tidNode2 = (TId)nodeArrayList1.get(0);
        tlcolNode3 = (TLCol)nodeArrayList2.get(0);
        tnintNode4 = (TNInt)nodeArrayList3.get(0);
        trcolNode5 = (TRCol)nodeArrayList4.get(0);

        pvarNode1 = new AMatrizVar(tidNode2, tlcolNode3, tnintNode4, trcolNode5);
        }
	nodeList.add(pvarNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new2() /* reduce AStringValor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PValor pvalorNode1;
        {
            // Block
        TString tstringNode2;
        tstringNode2 = (TString)nodeArrayList1.get(0);

        pvalorNode1 = new AStringValor(tstringNode2);
        }
	nodeList.add(pvalorNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new3() /* reduce AInteiroValor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PValor pvalorNode1;
        {
            // Block
        TNInt tnintNode2;
        tnintNode2 = (TNInt)nodeArrayList1.get(0);

        pvalorNode1 = new AInteiroValor(tnintNode2);
        }
	nodeList.add(pvalorNode1);
        return nodeList;
    }



    @SuppressWarnings({ "unchecked", "rawtypes" })
    ArrayList<Object> new4() /* reduce ARealValor */
    {
        @SuppressWarnings("hiding") ArrayList<Object> nodeList = new ArrayList<Object>();

        @SuppressWarnings("unused") ArrayList<Object> nodeArrayList1 = pop();
        PValor pvalorNode1;
        {
            // Block
        TNReal tnrealNode2;
        tnrealNode2 = (TNReal)nodeArrayList1.get(0);

        pvalorNode1 = new ARealValor(tnrealNode2);
        }
	nodeList.add(pvalorNode1);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, ERROR, 0}, {0, SHIFT, 1}, },
			{{-1, REDUCE, 0}, {6, SHIFT, 3}, },
			{{-1, ERROR, 2}, {53, ACCEPT, -1}, },
			{{-1, ERROR, 3}, {2, SHIFT, 4}, },
			{{-1, ERROR, 4}, {7, SHIFT, 5}, },
			{{-1, REDUCE, 1}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 2}, },
			{{-1, -1}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: id",
			"expecting: '[', EOF",
			"expecting: EOF",
			"expecting: n int",
			"expecting: ']'",
        };*/
    private static int[] errors;
/*      {
			0, 1, 2, 3, 4, 2, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}
